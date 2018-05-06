package com.gym.web.dao;

import com.gym.web.model.DicClassroom;
import com.gym.web.model.DicClassroomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DicClassroomDao {
    long countByExample(DicClassroomExample example);

    int deleteByExample(DicClassroomExample example);

    int deleteByPrimaryKey(String id);

    int insert(DicClassroom record);

    int insertSelective(DicClassroom record);

    List<DicClassroom> selectByExample(DicClassroomExample example);

    DicClassroom selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DicClassroom record, @Param("example") DicClassroomExample example);

    int updateByExample(@Param("record") DicClassroom record, @Param("example") DicClassroomExample example);

    int updateByPrimaryKeySelective(DicClassroom record);

    int updateByPrimaryKey(DicClassroom record);
}