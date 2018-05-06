package com.gym.web.service;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gym.commons.service.BaseService;
import com.gym.web.model.Teacher;

import java.util.List;
import java.util.Map;

public interface TeacherSer extends BaseService<Teacher> {


    List<Map<String, Object>> findTeacher(Map<String, String> querymap);

    int updateTeacher(Map<String, String> map);

    int addTeacher(Map<String, String> pqramMap);

    Teacher findByPrimaryKey(String uid);

    JSONArray getCourse(Map<String, String> querymap);
}
