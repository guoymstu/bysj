package com.gym.web.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.gym.commons.dao.BaseDao;
import com.gym.commons.service.BaseServiceImpl;
import com.gym.web.dao.DicCoursetypeDao;
import com.gym.web.model.DicCoursetype;
import com.gym.web.service.DicCourseTypeSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("DicCourseTypeSer")
@Transactional
public class DicCourseTypeSerImpl extends BaseServiceImpl<DicCoursetype> implements DicCourseTypeSer {

    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Resource
    public DicCoursetypeDao dicCoursetypeDao;

    @Override
    protected BaseDao<DicCoursetype> getDao() {
        return dicCoursetypeDao;
    }


    @Override
    public JSONArray getCourseType() {

        JSONArray array;

        StringBuilder sql=new StringBuilder();
        sql.append(" select coursetype from dic_courseType ");

        String jsonStr= JSON.toJSONString(jdbcTemplate.queryForList(sql.toString()));
        array=JSON.parseArray(jsonStr);
        return array;
    }
}
