package com.gym.web.dao;

import com.gym.commons.dao.BaseDao;
import com.gym.web.model.GxTeacourse;
import com.gym.web.model.GxTeacourseExample;
import java.util.List;

import com.gym.web.model.Pjcontext;
import org.apache.ibatis.annotations.Param;

public interface GxTeacourseDao  extends BaseDao<GxTeacourse> {
    long countByExample(GxTeacourseExample example);

    int deleteByExample(GxTeacourseExample example);

    int deleteByPrimaryKey(String teaid);

    int insert(GxTeacourse record);

    int insertSelective(GxTeacourse record);

    List<GxTeacourse> selectByExample(GxTeacourseExample example);

    GxTeacourse selectByPrimaryKey(String teaid);

    int updateByExampleSelective(@Param("record") GxTeacourse record, @Param("example") GxTeacourseExample example);

    int updateByExample(@Param("record") GxTeacourse record, @Param("example") GxTeacourseExample example);

    int updateByPrimaryKeySelective(GxTeacourse record);

    int updateByPrimaryKey(GxTeacourse record);
}