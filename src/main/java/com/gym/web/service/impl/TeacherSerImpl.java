package com.gym.web.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gym.commons.dao.BaseDao;

import com.gym.commons.helper.StringHelper;
import com.gym.commons.service.BaseServiceImpl;
import com.gym.web.dao.TeacherDao;
import com.gym.web.model.Teacher;
import com.gym.web.model.TeacherExample;
import com.gym.web.service.TeacherSer;

import com.gym.web.model.TeacherExample.Criteria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("teacherSer")
@Transactional
public class TeacherSerImpl extends BaseServiceImpl<Teacher> implements TeacherSer {

    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Resource
    TeacherDao teacherDao;

    @Override
    protected BaseDao<Teacher> getDao() {
        return teacherDao;
    }


    @Override
    public List<Map<String, Object>> findTeacher(Map<String, String> querymap) {

        StringBuilder sql = new StringBuilder();
        sql.append("    SELECT tuser.id, tuser.role, tuser.username, tuser.uid, tuser.block, teacher.sex, teacher.telnum, teacher.mail, teacher.address  ");
        sql.append(" FROM tb_teacher teacher LEFT JOIN tb_user tuser ON teacher.id=tuser.uid ");
        sql.append("    where 1=1                 ");
        if (StringHelper.isNotEmpty(querymap.get("keyword"))) {
            sql.append(" and  teacher.id like '%" + querymap.get("keyword") + "%'");
            sql.append(" or teacher.name like  '%" + querymap.get("keyword") + "%'");
        }
        // sql.append(" limit 0,100");
        // System.out.println(jdbcTemplate.queryForList(sql.toString()));
        return jdbcTemplate.queryForList(sql.toString());
    }

    @Override
    public int updateTeacher(Map<String, String> map) {

        Teacher record = teacherDao.selectByPrimaryKey(map.get("uid"));

        TeacherExample example = new TeacherExample();
        String address = map.get("province") + map.get("city") + map.get("county") + "(" + map.get("address") + ")";

        Criteria criteria = example.createCriteria();

        criteria.andNameEqualTo(map.get("username"));
        criteria.andTealevelEqualTo(map.get("tealevel"));
        criteria.andYuanxiEqualTo(map.get("yuanxi"));
        criteria.andTelnumEqualTo(map.get("telnum"));
        criteria.andSexEqualTo(map.get("sex"));
        criteria.andAddressEqualTo(address);
        criteria.andMailEqualTo(map.get("mail"));

        int i = teacherDao.updateByExample(record, example);
        return i;
    }

    @Override
    public int addTeacher(Map<String, String> map) {

        Teacher teacher = new Teacher();
        teacher.setId(map.get("uid"));

        String address = map.get("province") + map.get("city") + map.get("county") + "(" + map.get("address") + ")";
        teacher.setAddress(address);

        teacher.setMail(map.get("email"));
        teacher.setName(map.get("username"));
        teacher.setSex(map.get("sex"));
        teacher.setTealevel(map.get("tealevel"));
        teacher.setTelnum(map.get("telnum"));
        teacher.setYuanxi(map.get("yuanxi"));

        int i = teacherDao.insert(teacher);

        return i;
    }

    @Override
    public Teacher findByPrimaryKey(String uid) {
        Teacher teacher = teacherDao.selectByPrimaryKey(uid);
        return teacher;
    }

    @Override
    public JSONArray getCourse(Map<String, String> querymap) {

        StringBuilder sql = new StringBuilder();
        sql.append("  SELECT * from(   ");
        sql.append(" SELECT *,case when  ISNULL(gxTeaId) THEN '0' else '1' end as status        ");
        sql.append(" FROM(                                                                       ");
        sql.append("         SELECT course.*,gx.courseID as gxCourseId,gx.teaID as gxTeaId FROM  ");
        sql.append("         tb_course course left JOIN gx_teacourse gx on course.id=gx.courseID   where 1=1 ");
        if (StringHelper.isNotEmpty(querymap.get("keyword"))) {
            sql.append(" and  course.id like '%" + querymap.get("keyword") + "%'");
            sql.append(" or  course.coursename like  '%" + querymap.get("keyword") + "%'");
        }
        sql.append("                                                                              ");
        sql.append(" ) temp ");
        sql.append(" ) temp2");
        sql.append(" where status='" + querymap.get("status") + "' ");

        String jsonStr = JSON.toJSONString(jdbcTemplate.queryForList(sql.toString()));
        return JSONArray.parseArray(jsonStr.toLowerCase());
    }


}
