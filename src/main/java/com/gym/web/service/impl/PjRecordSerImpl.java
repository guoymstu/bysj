package com.gym.web.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.gym.commons.dao.BaseDao;
import com.gym.commons.service.BaseServiceImpl;
import com.gym.web.dao.PjcontextDao;
import com.gym.web.dao.PjrecordDao;
import com.gym.web.model.Pjrecord;
import com.gym.web.service.PjRecordSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.UUID;

@Service("PjRecordSer")
@Transactional
public class PjRecordSerImpl extends BaseServiceImpl<Pjrecord> implements PjRecordSer {

    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Resource
    PjrecordDao pjrecordDao;

    @Override
    protected BaseDao<Pjrecord> getDao() {
        return null;
    }


    @Override
    public int addRecord(String courseid, String stuid, JSONArray array) {

        int j = 0;
        for (int i = 0; i < array.size(); i++) {
            Pjrecord pjrecord = new Pjrecord();
            String contentid = array.getJSONObject(i).get("name").toString();
            String marking = array.getJSONObject(i).get("value").toString();

            pjrecord.setId(UUID.randomUUID().toString());
            pjrecord.setContextid(contentid);
            pjrecord.setMarking(marking);
            pjrecord.setStunum(stuid);
            pjrecord.setCourseid(courseid);
            try {
                pjrecordDao.insert(pjrecord);
                j++;
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        return j;
    }

    @Override
    public int addRecord(String courseid, String stuid, String issue) {
        Pjrecord pjrecord = new Pjrecord();
        int i = 0;

        pjrecord.setId(UUID.randomUUID().toString());
        pjrecord.setCourseid(courseid);
        pjrecord.setStunum(stuid);
        pjrecord.setRemark(issue);
        try {
            i = pjrecordDao.insert(pjrecord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    /**
     * 评教得分
     *
     * @param teaId
     * @return
     */
    @Override
    public JSONArray getAvgmark(String teaId) {

        StringBuilder sql = new StringBuilder();

        sql.append(" select courseid,coursename,mark from(       ");
        sql.append(" select courseID,avg(countMark) mark       ");
        sql.append(" 	FROM(       ");
        sql.append(" 	select courseId, FORMAT(sum(marking),2) as countMark FROM tb_pjrecord record       ");
        sql.append(" 	GROUP BY courseId,stuNum       ");
        sql.append(" 	)temp        ");
        sql.append(" 	where courseID in (select courseid from gx_teacourse where teaID='" + teaId + "')       ");
        sql.append(" 	GROUP BY courseID       ");
        sql.append(" 	)temp2 left join tb_course course on temp2.courseid=course.id       ");

        String jsonStr = JSON.toJSONString(jdbcTemplate.queryForList(sql.toString()));
        JSONArray array = JSONArray.parseArray(jsonStr);

        return array;
    }

    @Override
    public JSONArray getRemarks(String teaId) {
        StringBuilder sql = new StringBuilder();

        sql.append(" select courseid,remark FROM tb_pjrecord ");
        sql.append(" where remark is not null ");
        sql.append(" and courseid in (select courseid from gx_teacourse where teaID='" + teaId + "') ");
        sql.append(" GROUP BY courseid,stunum ");

        String jsonStr = JSON.toJSONString(jdbcTemplate.queryForList(sql.toString()));
        JSONArray array = JSONArray.parseArray(jsonStr);

        return array;
    }
}
