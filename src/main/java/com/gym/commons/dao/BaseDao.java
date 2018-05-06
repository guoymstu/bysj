package com.gym.commons.dao;

import com.gym.commons.model.BasePage;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface BaseDao<T> {
	/**
	 * 根据id删除
	 * 
	 * @param id
	 * @return
	 */
	 int deleteById(@Param("id") String id);

	/**
	 * 根据一些id删除
	 * @param map
	 * @param sqlData
	 */
	 void deleteBySomeId(@Param("map") Map map, @Param("sqlData") String sqlData, @Param("list") List list);

	/**
	 * 添加
	 *
	 * @param t
	 * @return
	 */
	 int insert(T t);

	/**
	 * 根据id查找
	 *
	 * @param id
	 * @return
	 */
	 T selectById(@Param("id") String id);


	/**
	 * 查询 不分页
	 *
	 * @param map
	 *            参数map
	 * @param sqlData
	 *            sql语句
	 * @return
	 */
	 List<T> list(@Param("map") Map<String, Object> map, @Param("sqlData") String sqlData);

	/**
	 * 更新
	 *
	 * @param t
	 * @return
	 */
	 int updateById(T t);

	/**
	 * 分页查找
	 *
	 * @param map
	 * @param page
	 * @param sqlData
	 * @return
	 */
	 List<T> findPage(@Param("map") Map<String, Object> map,
                            @Param("page") BasePage<T> page, @Param("sqlData") String sqlData);

	/**
	 * 总条数
	 *
	 * @param map
	 * @param sqlData
	 * @return
	 */
	 int rowsSize(@Param("map") Map<String, Object> map, @Param("sqlData") String sqlData);

	/**
	 * 用于in查询
	 *
	 * @param map
	 * @param sqlData
	 * @param list
	 * @return
	 */
	 List<T> listBySomeId(@Param("map") Map<String, Object> map,
                                @Param("sqlData") String sqlData, @Param("list") List<String> list);
}


