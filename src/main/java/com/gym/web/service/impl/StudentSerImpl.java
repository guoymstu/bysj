package com.gym.web.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.gym.commons.dao.BaseDao;
import com.gym.commons.helper.StringHelper;
import com.gym.commons.service.BaseServiceImpl;
import com.gym.web.dao.StudentDao;
import com.gym.web.model.Student;

import com.gym.web.model.StudentExample;

import com.gym.web.service.StudentSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("studentSer")
@Transactional
public class StudentSerImpl extends BaseServiceImpl<Student> implements StudentSer {

    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Resource
    StudentDao studentDao;

    @Override
    protected BaseDao<Student> getDao() {
        return (BaseDao<Student>) studentDao;
    }


    @Override
    public List<Map<String, Object>> findStudent(Map<String, String> querymap) {

        StringBuilder sql = new StringBuilder();
        sql.append("    SELECT  tuser.id, tuser.role, tuser.username, tuser.uid, tuser.block,  student.sex, student.telnum, student.mail, student.address  ");
        sql.append(" FROM  tb_student student left  join  tb_user tuser on  student.id=tuser.uid");
        sql.append("    where 1=1                 ");
        if (StringHelper.isNotEmpty(querymap.get("keyword"))) {
            sql.append(" and  student.id like '%" + querymap.get("keyword") + "%'");
            sql.append(" or student.name like  '%" + querymap.get("keyword") + "%'");
        }
        System.out.println(jdbcTemplate.queryForList(sql.toString()));
        return jdbcTemplate.queryForList(sql.toString());
    }

    @Override
    public int updateStudent(Map<String, String> map) {

        Student student = new Student();
        student.setId(map.get("uid"));
        student.setClassid(map.get("banji"));
        student.setAddress(map.get("address"));
        student.setIdcardnum(map.get("idcardnum"));
        student.setMail(map.get("email"));
        student.setName(map.get("username"));
        student.setSex(map.get("sex"));
        student.setTelnum(map.get("telnum"));
        student.setRemark(map.get("remark"));
        int i = studentDao.updateByPrimaryKey(student);


        return i;
    }

    @Override
    public int addStudent(Map<String, String> map) {

        Student student = new Student();
        student.setId(map.get("uid"));
        student.setClassid(map.get("banji"));
        student.setAddress(map.get("address"));
        student.setIdcardnum(map.get("idcardnum"));
        student.setMail(map.get("email"));
        student.setName(map.get("username"));
        student.setSex(map.get("sex"));
        student.setTelnum(map.get("telnum"));
        student.setRemark(map.get("remark"));

        int i = studentDao.insert(student);
        return i;
    }

    @Override
    public Student findByPrimaryKey(String uid) {
        Student student = studentDao.selectByPrimaryKey(uid);
        return student;
    }

    @Override
    public JSONArray getCourse(Map<String, String> querymap) {
        StringBuilder sql = new StringBuilder();

        //排除自己已选的课程
        sql.append("     select temp3.*,teacher.name from  gx_teacourse gx left join tb_teacher teacher ON teacher.id = gx.teaID ");
        sql.append("     LEFT JOIN (      ");
        sql.append("     SELECT	* FROM  (");
        sql.append("     SELECT	course.*,	ifnull( countSel, 0 ) AS countsel,CASE WHEN ifnull( countSel, 0 ) < countstu THEN	'1' ELSE '0' END AS STATUS");
        sql.append("             FROM   ");
        sql.append("     tb_course course");
        sql.append("     LEFT JOIN ( SELECT courseID, count( courseID ) AS countSel FROM gx_stucourse GROUP BY courseID ) temp ON course.id = temp.courseID");
        sql.append("     ) temp2                                                                                       ");
        sql.append("  WHERE 1=1       ");
        sql.append(" ) temp3 on gx.courseID=temp3.id ");

        sql.append("  where gx.courseid not in      ");
        sql.append("   (SELECT courseId FROM gx_stucourse WHERE stuID = '"+querymap.get("stuid")+"' ) ");
        if (StringHelper.isNotEmpty(querymap.get("keyword"))) {
            sql.append(" and  temp3.id like '%" + querymap.get("keyword") + "%'");
            sql.append(" or  temp3.coursename like  '%" + querymap.get("keyword") + "%'");
        }
        if(StringHelper.isNotEmpty(querymap.get("status"))){
            sql.append("  and   status = '"+querymap.get("status")+"' ");
        }

        String jsonStr = JSON.toJSONString(jdbcTemplate.queryForList(sql.toString()));

        return JSONArray.parseArray(jsonStr.toLowerCase());
    }
}
