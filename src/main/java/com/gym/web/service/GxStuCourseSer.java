package com.gym.web.service;

import com.alibaba.fastjson.JSONArray;
import com.gym.commons.service.BaseService;
import com.gym.web.model.GxStucourse;
import com.gym.web.model.GxTeacourse;

import java.util.Map;

public interface GxStuCourseSer extends BaseService<GxStucourse> {
    int selectCourse(String stuid, String courseid);

    JSONArray getMyCourse(Map<String, String> querymap);

    int recallCourse(String stuid, String courseid);

    JSONArray getPingjiaoList(Map<String, String> querymap);
}
