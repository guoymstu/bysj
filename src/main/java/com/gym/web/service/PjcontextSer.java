package com.gym.web.service;

import com.alibaba.fastjson.JSONArray;
import com.gym.commons.service.BaseService;
import com.gym.web.model.Pjcontext;
import com.gym.web.model.User;

import java.util.Map;


public interface PjcontextSer extends BaseService<Pjcontext> {


    JSONArray getPjcontext(Map<String, String> querymap);

    int addPingjiao(Map<String, String> paramap);

    int delPingjiaoById(String pjId);

    int countById(String id);

    JSONArray getItems(String courseid);
}
