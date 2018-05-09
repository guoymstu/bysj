package com.gym.web.service.impl;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.gym.commons.dao.BaseDao;
import com.gym.commons.helper.StringHelper;
import com.gym.commons.service.BaseServiceImpl;
import com.gym.web.dao.CourseDao;
import com.gym.web.dao.PjcontextDao;
import com.gym.web.model.Course;
import com.gym.web.model.Pjcontext;
import com.gym.web.service.PjcontextSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;


@Service("PjcontextSer")
@Transactional
public class PjcontextSerImpl extends BaseServiceImpl<Pjcontext> implements PjcontextSer {

    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Resource
    PjcontextDao pjcontextDao;
    @Resource
    CourseDao courseDao;

    @Override
    protected BaseDao<Pjcontext> getDao() {
        return pjcontextDao;
    }


    @Override
    public JSONArray getPjcontext(Map<String, String> map) {

        JSONArray array;
        StringBuilder sql = new StringBuilder();
        sql.append(" select id,pjtype,maxscore,block,sort,contentstr,remark,coursetype ");
        sql.append(" from tb_pjcontext where 1=1 ");
        if (StringHelper.isNotEmpty(map.get("pjtype"))) {
            sql.append(" and  pjtype= '" + map.get("pjtype") + "'");
        }
        if(StringHelper.isNotEmpty(map.get("courseType"))){
            sql.append("and coursetype= '"+map.get("coursetype")+"'  ");
        }

        String jsonStr= JSON.toJSONString(jdbcTemplate.queryForList(sql.toString()));
        array=JSON.parseArray(jsonStr);
        return array;
    }

    @Override
    public int addPingjiao(Map<String, String> map) {

        Pjcontext pingjiao=new Pjcontext();

        pingjiao.setId(map.get("id"));
        pingjiao.setCoursetype(map.get("coursetype"));
        pingjiao.setBlock("0");
        pingjiao.setMaxscore(map.get("maxscore"));
        pingjiao.setSort(map.get("sort"));
        pingjiao.setPjtype(map.get("pingjiaotype"));
        pingjiao.setContentstr(map.get("pingjiaocontent"));
        int i=pjcontextDao.insert(pingjiao);
        return i;
    }

    @Override
    public int delPingjiaoById(String pjId) {
        int i=pjcontextDao.deleteByPrimaryKey(pjId);
        return i;
    }

    /**
     * 是否已存在
     * @param id
     * @return
     */
    @Override
    public int countById(String id) {
        int i=0;
        Pjcontext pj= pjcontextDao.selectByPrimaryKey(id);
        if (pj!= null) {
            i=1;
        }
        return i;
    }

    @Override
    public JSONArray getItems(String courseid) {

        JSONArray array;
        Course course=courseDao.selectByPrimaryKey(courseid);
        String coursetype=course.getCoursetype();

        StringBuilder sql=new StringBuilder();
        sql.append("SELECT * FROM tb_pjcontext     ");
        sql.append(" where courseType='"+coursetype+"'");
        sql.append(" ORDER BY pjType, sort");

        String jsonStr=JSON.toJSONString(jdbcTemplate.queryForList(sql.toString()));
        array=JSONArray.parseArray(jsonStr.toLowerCase());

        return array;
    }
}
