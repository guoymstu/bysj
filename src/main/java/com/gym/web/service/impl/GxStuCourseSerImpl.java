package com.gym.web.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.gym.commons.dao.BaseDao;
import com.gym.commons.helper.StringHelper;
import com.gym.commons.service.BaseServiceImpl;
import com.gym.web.dao.GxStucourseDao;
import com.gym.web.model.GxStucourse;
import com.gym.web.service.GxStuCourseSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;

@Service("GxStuCourseSer")
@Transactional
public class GxStuCourseSerImpl extends BaseServiceImpl<GxStucourse> implements GxStuCourseSer {
    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    @Resource
    GxStucourseDao gxStucourseDao;

    @Override
    protected BaseDao<GxStucourse> getDao() {
        return gxStucourseDao;
    }


    /**
     * 学生选课
     *
     * @param stuid
     * @param courseid
     * @return
     */
    @Override
    public int selectCourse(String stuid, String courseid) {
        GxStucourse gx = new GxStucourse();
        gx.setCourseid(courseid);
        gx.setStuid(stuid);
        int i = gxStucourseDao.insert(gx);
        return i;
    }

    /**
     * 学生己选课程
     *
     * @param querymap
     * @return
     */
    @Override
    public JSONArray getMyCourse(Map<String, String> querymap) {


        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT course.*,teacher.name FROM gx_stucourse gx left join tb_course course on course.id=gx.courseID ");
        sql.append(" left join gx_teacourse gx2 on course.id=gx2.courseID ");
        sql.append(" left join tb_teacher teacher on teacher.id=gx2.teaID ");
        sql.append(" where 1=1 ");
        sql.append(" and  gx.stuID='" + querymap.get("stuid") + "'");
        if (StringHelper.isNotEmpty(querymap.get("keyword"))) {
            sql.append(" and  course.id like '%" + querymap.get("keyword") + "%'");
            sql.append(" or course.coursename like '%" + querymap.get("keyword") + "%' ");
        }
        String jsonStr = JSON.toJSONString(jdbcTemplate.queryForList(sql.toString()));
        JSONArray arry = JSONArray.parseArray(jsonStr.toLowerCase());
        return arry;
    }

    /**
     * 删除学生选课
     * @param stuid
     * @param courseid
     * @return
     */
    @Override
    public int recallCourse(String stuid, String courseid) {
        StringBuilder sql = new StringBuilder();
        if (stuid != null && courseid != null) {
            sql.append(" DELETE FROM gx_stucourse  ");
            sql.append(" where stuid='" + stuid + "'");
            sql.append(" and courseID='" + courseid + "' ");
        }

        int i= jdbcTemplate.update(sql.toString());
        return i;
    }

    @Override
    public JSONArray getPingjiaoList(Map<String, String> querymap) {

        StringBuilder sql = new StringBuilder();

        sql.append(" SELECT course.*,teacher.name,case when isnull(record.courseId) then '1' else '0' end as status ");
        sql.append(" FROM gx_stucourse gx ");
        sql.append(" left join tb_course course on course.id=gx.courseID ");
        sql.append(" left join gx_teacourse gx2 on course.id=gx2.courseID ");
        sql.append(" left join tb_teacher teacher on teacher.id=gx2.teaID ");
        sql.append(" left join tb_pjrecord  record on record.stuNUm=gx.stuID and record.courseId=gx.courseID ");
        sql.append(" where gx.stuID='"+querymap.get("stuid")+"' ");

        if (StringHelper.isNotEmpty(querymap.get("keyword"))) {
            sql.append(" and  course.id like '%" + querymap.get("keyword") + "%'");
            sql.append(" or course.coursename like '%" + querymap.get("keyword") + "%' ");
        }
        sql.append(" GROUP BY gx.courseID ");
        String jsonStr = JSON.toJSONString(jdbcTemplate.queryForList(sql.toString()));
        JSONArray arry = JSONArray.parseArray(jsonStr.toLowerCase());
        return arry;
    }
}
