package com.gym.commons.service;

import com.gym.commons.dao.BaseDao;
import com.gym.commons.helper.UuidHelper;
import com.gym.commons.model.BaseBean;
import com.gym.commons.model.BasePage;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public abstract class BaseServiceImpl<T> implements BaseService<T> {
    private static final long serialVersionUID = 1L;

    protected abstract BaseDao<T> getDao();


    public int removeById(String id) {
        return this.getDao().deleteById(id);
    }

    public void removeBySomeId(Map map, String sql, List list) {
        if (null != list && list.size() > 0) {
            this.getDao().deleteBySomeId(map, sql, list);
        }

    }

    public int add(T t) {
        ((BaseBean)t).setId(UuidHelper.getRandomUUID());
        ((BaseBean)t).setCreateTime(new Date());
        return this.getDao().insert(t);
    }

    public T findById(String id) {
        return this.getDao().selectById(id);
    }

    public List<T> list(Map<String, Object> map, String sql) {
        System.out.println("##################");
        return this.getDao().list(map, sql);
    }

    public int modifyById(T t) {
        return this.getDao().updateById(t);
    }

    public BasePage<T> findPage(Map<String, Object> map, BasePage<T> page, String sql) {
        int totalRecord = this.getDao().rowsSize(map, sql);
        page.setTotalRecord(totalRecord);
        return page;
    }

    public List<T> listBySomeId(Map<String, Object> map, String sqlData, List<String> list) {
        return (List)(list.size() <= 0 ? new ArrayList() : this.getDao().listBySomeId(map, sqlData, list));
    }

    public int rowsSize(Map<String, Object> map, String sql) {
        return this.getDao().rowsSize(map, sql);
    }


}
