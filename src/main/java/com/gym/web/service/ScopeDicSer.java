package com.gym.web.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gym.commons.service.BaseService;
import com.gym.web.model.DicScope;


public interface ScopeDicSer extends BaseService<DicScope> {


    JSONArray getYuanxi();

    JSONArray getAll();

    JSONArray getZhuanye();

    JSONArray getNianji();
}
