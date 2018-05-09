package com.gym.web.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.gym.commons.dao.BaseDao;
import com.gym.commons.helper.StringHelper;
import com.gym.commons.service.BaseServiceImpl;
import com.gym.web.dao.CourseDao;
import com.gym.web.model.*;
import com.gym.web.service.CourseSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;

@Service("CourseSer")
@Transactional
public class CourseSerImpl extends BaseServiceImpl<Course> implements CourseSer {


    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Resource
    public CourseDao courseDao;

    @Override
    protected BaseDao<Course> getDao() {
        return null;
    }

    @Override
    public JSONArray findCourse(Map<String, String> querymap) {

        StringBuilder sql = new StringBuilder();
        sql.append("  SELECT  id,coursename,coursehours,address,year,term,coursetype,remark,timeplan,commontype,countstu,coursescore  ");
        sql.append(" FROM tb_course  where 1=1   ");

        if (StringHelper.isNotEmpty(querymap.get("keyword"))) {
            sql.append(" and  id like '%" + querymap.get("keyword") + "%'");
            sql.append(" or  coursename like  '%" + querymap.get("keyword") + "%'");
        }
        String jsonStr = JSON.toJSONString(jdbcTemplate.queryForList(sql.toString()));
        return JSONArray.parseArray(jsonStr);
    }


    @Override
    public int saveCourse(Map<String, String> map) {

        Course course = new Course();
        course.setId(map.get("courseid"));
        course.setCoursename(map.get("coursename"));
        course.setCoursehours(map.get("coursehours"));
        course.setAddress(map.get("address"));
        course.setYear(map.get("year"));
        course.setTerm(map.get("term"));
        course.setCoursetype(map.get("coursetype"));
        course.setTimeplan(map.get("timeplan"));

        course.setCountstu(map.get("countstu"));
        course.setCoursescore(map.get("coursescore"));
        int i = courseDao.insert(course);

        return i;
    }

    @Override
    public int updataCourse(Map<String, String> map) {
        Course course = new Course();
        course.setId(map.get("courseid"));
        course.setCoursename(map.get("coursename"));
        course.setCoursehours(map.get("coursehours"));
        course.setAddress(map.get("address"));
        course.setYear(map.get("year"));
        course.setTerm(map.get("term"));
        course.setCoursetype(map.get("coursetype"));
        course.setTimeplan(map.get("timeplan"));

        course.setCountstu(map.get("countstu"));
        course.setCoursescore(map.get("coursescore"));
        int i = courseDao.updateByPrimaryKey(course);

        return i;
    }

    @Override
    public int delCourseByid(String courseid) {
        CourseExample example = new CourseExample();
        CourseExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(courseid);
        int i = courseDao.deleteByExample(example);
        return i;
    }

    @Override
    public Course findByPrimaryKey(String courseid) {
        Course course=courseDao.selectByPrimaryKey(courseid);

        return course;
    }




}
