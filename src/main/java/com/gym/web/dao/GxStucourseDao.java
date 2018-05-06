package com.gym.web.dao;

import com.gym.commons.dao.BaseDao;
import com.gym.web.model.GxStucourse;
import com.gym.web.model.GxStucourseExample;
import java.util.List;

import com.gym.web.model.GxTeacourse;
import org.apache.ibatis.annotations.Param;

public interface GxStucourseDao extends BaseDao<GxStucourse> {
    long countByExample(GxStucourseExample example);

    int deleteByExample(GxStucourseExample example);

    int deleteByPrimaryKey(String stuid);

    int insert(GxStucourse record);

    int insertSelective(GxStucourse record);

    List<GxStucourse> selectByExample(GxStucourseExample example);

    GxStucourse selectByPrimaryKey(String stuid);

    int updateByExampleSelective(@Param("record") GxStucourse record, @Param("example") GxStucourseExample example);

    int updateByExample(@Param("record") GxStucourse record, @Param("example") GxStucourseExample example);

    int updateByPrimaryKeySelective(GxStucourse record);

    int updateByPrimaryKey(GxStucourse record);
}