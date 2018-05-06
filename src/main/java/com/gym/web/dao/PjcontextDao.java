package com.gym.web.dao;

import com.gym.commons.dao.BaseDao;
import com.gym.web.model.Pjcontext;
import com.gym.web.model.PjcontextExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PjcontextDao extends BaseDao<Pjcontext> {
    long countByExample(PjcontextExample example);

    int deleteByExample(PjcontextExample example);

    int deleteByPrimaryKey(String id);

    int insert(Pjcontext record);

    int insertSelective(Pjcontext record);

    List<Pjcontext> selectByExample(PjcontextExample example);

    Pjcontext selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Pjcontext record, @Param("example") PjcontextExample example);

    int updateByExample(@Param("record") Pjcontext record, @Param("example") PjcontextExample example);

    int updateByPrimaryKeySelective(Pjcontext record);

    int updateByPrimaryKey(Pjcontext record);
}