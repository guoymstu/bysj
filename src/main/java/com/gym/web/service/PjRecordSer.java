package com.gym.web.service;

import com.alibaba.fastjson.JSONArray;
import com.gym.commons.service.BaseService;
import com.gym.web.model.Pjrecord;

public interface PjRecordSer extends BaseService<Pjrecord> {
    int addRecord(String courseid, String stuid, JSONArray array);

    int addRecord(String courseid, String stuid, String issue);

    JSONArray getAvgmark(String teaId);

    JSONArray getRemarks(String teaId);
}
