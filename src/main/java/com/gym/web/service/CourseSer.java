package com.gym.web.service;


import com.alibaba.fastjson.JSONArray;
import com.gym.commons.service.BaseService;
import com.gym.web.model.Course;

import java.util.Map;

public interface CourseSer extends BaseService<Course> {


    JSONArray findCourse(Map<String, String> querymap);

    int saveCourse(Map<String, String> querymap);


    int delCourseByid(String courseid);

    Course findByPrimaryKey(String courseid);

    int updataCourse(Map<String, String> querymap);
}
