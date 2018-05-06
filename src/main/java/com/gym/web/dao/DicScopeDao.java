package com.gym.web.dao;

import com.gym.commons.dao.BaseDao;
import com.gym.web.model.DicScope;
import com.gym.web.model.DicScopeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DicScopeDao extends BaseDao<DicScope> {
    long countByExample(DicScopeExample example);

    int deleteByExample(DicScopeExample example);

    int deleteByPrimaryKey(String id);

    int insert(DicScope record);

    int insertSelective(DicScope record);

    List<DicScope> selectByExample(DicScopeExample example);

    DicScope selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DicScope record, @Param("example") DicScopeExample example);

    int updateByExample(@Param("record") DicScope record, @Param("example") DicScopeExample example);

    int updateByPrimaryKeySelective(DicScope record);

    int updateByPrimaryKey(DicScope record);
}