package com.gym.web.dao;

import com.gym.commons.dao.BaseDao;
import com.gym.web.model.Teacher;
import com.gym.web.model.TeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherDao extends BaseDao<Teacher> {
    long countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(String id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}