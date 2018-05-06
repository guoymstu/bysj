package com.gym.web.service;


import com.alibaba.fastjson.JSONArray;
import com.gym.commons.service.BaseService;
import com.gym.web.model.DicCoursetype;

public interface DicCourseTypeSer extends BaseService<DicCoursetype>{


    JSONArray getCourseType();
}
