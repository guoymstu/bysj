package com.gym.web.service.impl;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gym.commons.dao.BaseDao;
import com.gym.commons.service.BaseServiceImpl;
import com.gym.web.dao.DicScopeDao;
import com.gym.web.model.DicScope;
import com.gym.web.service.ScopeDicSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


@Transactional
@Service("scopeDicSer")
public class ScopeDicSerImpl extends BaseServiceImpl<DicScope> implements ScopeDicSer {

    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    public DicScopeDao dicScopeDao;

    @Override
    protected BaseDao<DicScope> getDao() {
        return dicScopeDao;
    }


    @Override
    public JSONArray getYuanxi() {
        JSONArray array;
        StringBuilder sql = new StringBuilder();
        sql.append(" select DISTINCT scope.yuanxi, scope.nianji  FROM dic_scope scope  ");

        String jsonStr=JSON.toJSONString(jdbcTemplate.queryForList(sql.toString()));
        array=JSON.parseArray(jsonStr);
        return array;
    }

    @Override
    public JSONArray getZhuanye() {
        JSONArray array;
        StringBuilder sql = new StringBuilder();
        sql.append(" select DISTINCT scope.yuanxi, scope.zhuanye  FROM dic_scope scope ");
        String jsonStr=JSON.toJSONString(jdbcTemplate.queryForList(sql.toString()));
        array=JSON.parseArray(jsonStr);
        return array;
    }

    @Override
    public JSONArray getNianji() {
        JSONArray array;
        StringBuilder sql = new StringBuilder();
        sql.append(" select DISTINCT  scope.nianji  FROM dic_scope scope ");
        String jsonStr=JSON.toJSONString(jdbcTemplate.queryForList(sql.toString()));
        array=JSON.parseArray(jsonStr);
        return array;
    }

    @Override
    public JSONArray getAll() {
        JSONArray array;
        StringBuilder sql = new StringBuilder();
        sql.append(" select  *  FROM dic_scope  ");
        String jsonStr=JSON.toJSONString(jdbcTemplate.queryForList(sql.toString()));
        array=JSON.parseArray(jsonStr);
        return array;
    }


}
