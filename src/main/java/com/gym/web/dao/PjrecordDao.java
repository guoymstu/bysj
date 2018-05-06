package com.gym.web.dao;

import com.gym.web.model.Pjrecord;
import com.gym.web.model.PjrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PjrecordDao {
    long countByExample(PjrecordExample example);

    int deleteByExample(PjrecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(Pjrecord record);

    int insertSelective(Pjrecord record);

    List<Pjrecord> selectByExample(PjrecordExample example);

    Pjrecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Pjrecord record, @Param("example") PjrecordExample example);

    int updateByExample(@Param("record") Pjrecord record, @Param("example") PjrecordExample example);

    int updateByPrimaryKeySelective(Pjrecord record);

    int updateByPrimaryKey(Pjrecord record);
}