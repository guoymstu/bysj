package com.gym.web.service;

import com.alibaba.fastjson.JSONArray;
import com.gym.commons.service.BaseService;
import com.gym.web.model.GxTeacourse;

import java.util.Map;

public interface GxTeaCourseSer extends BaseService<GxTeacourse> {

    int record(String teaId, String courseid);

    int recallCourse(String teaId, String courseId);

    JSONArray getMyCourse(Map<String, String> querymap);
}
