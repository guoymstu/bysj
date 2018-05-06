package com.gym.web.service;

import com.alibaba.fastjson.JSONArray;
import com.gym.commons.service.BaseService;
import com.gym.web.model.Student;
import com.gym.web.model.Teacher;


import java.util.List;
import java.util.Map;

public interface StudentSer  extends BaseService<Student> {

    List<Map<String, Object>> findStudent(Map<String, String> querymap);

    int updateStudent(Map<String, String> pqramMap);

    int addStudent(Map<String, String> pqramMap);

    Student findByPrimaryKey(String uid);

    JSONArray getCourse(Map<String, String> querymap);
}
