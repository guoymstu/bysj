package com.gym.web.dao;

import com.gym.commons.dao.BaseDao;
import com.gym.web.model.DicCoursetype;
import com.gym.web.model.DicCoursetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DicCoursetypeDao extends BaseDao<DicCoursetype> {
    long countByExample(DicCoursetypeExample example);

    int deleteByExample(DicCoursetypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(DicCoursetype record);

    int insertSelective(DicCoursetype record);

    List<DicCoursetype> selectByExample(DicCoursetypeExample example);

    DicCoursetype selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DicCoursetype record, @Param("example") DicCoursetypeExample example);

    int updateByExample(@Param("record") DicCoursetype record, @Param("example") DicCoursetypeExample example);

    int updateByPrimaryKeySelective(DicCoursetype record);

    int updateByPrimaryKey(DicCoursetype record);
}