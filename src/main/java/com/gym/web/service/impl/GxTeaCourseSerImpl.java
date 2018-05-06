package com.gym.web.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.gym.commons.dao.BaseDao;
import com.gym.commons.helper.StringHelper;
import com.gym.commons.service.BaseServiceImpl;
import com.gym.web.dao.GxTeacourseDao;
import com.gym.web.model.GxTeacourse;
import com.gym.web.service.GxTeaCourseSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;

@Service("GxTeaCourseSer")
@Transactional
public class GxTeaCourseSerImpl extends BaseServiceImpl<GxTeacourse> implements GxTeaCourseSer {
    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Resource
    GxTeacourseDao gxTeacourseDao;

    @Override
    protected BaseDao<GxTeacourse> getDao() {
        return gxTeacourseDao;
    }


    @Override
    public int record(String teaId, String courseid) {


        GxTeacourse gx = new GxTeacourse();
        gx.setTeaid(teaId);
        gx.setCourseid(courseid);
        int i = gxTeacourseDao.insert(gx);
        return i;
    }

    /**
     * 教师退回课程
     * @param teaId
     * @param courseId
     * @return
     */
    @Override
    public int recallCourse(String teaId, String courseId) {

        StringBuilder sql = new StringBuilder();
        if (teaId != null && courseId != null) {
            sql.append(" DELETE FROM gx_teacourse  ");
            sql.append(" where teaId='" + teaId + "'");
            sql.append(" and courseID='" + courseId + "' ");
        }

       int i= jdbcTemplate.update(sql.toString());
        return i;
    }

    @Override
    public JSONArray getMyCourse(Map<String, String> querymap) {

        JSONArray array;
        StringBuilder sql=new StringBuilder();

        sql.append(" SELECT * from  gx_teacourse gx ");
        sql.append(" left join  tb_course course on course.id=gx.courseID  where 1=1 ");
        sql.append(" and gx.teaId='"+querymap.get("teaId")+"' ");
        if(StringHelper.isNotEmpty(querymap.get("keyword"))){
            sql.append(" and course.id like '%"+querymap.get("keyword")+"%' ");
            sql.append(" or course.coursename like '%"+querymap.get("keyword")+"%' ");
        }

        String jsonStr= JSON.toJSONString(jdbcTemplate.queryForList(sql.toString()));
        array=JSON.parseArray(jsonStr.toLowerCase());
        return array;
    }
}
