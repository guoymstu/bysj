package com.gym.web.service.impl;

import com.gym.commons.dao.BaseDao;

import com.gym.commons.helper.SecurityHelper;
import com.gym.commons.helper.StringHelper;
import com.gym.commons.service.BaseServiceImpl;
import com.gym.web.dao.StudentDao;
import com.gym.web.dao.TeacherDao;
import com.gym.web.dao.UserDao;
import com.gym.web.model.Student;
import com.gym.web.model.Teacher;
import com.gym.web.model.User;
import com.gym.web.model.UserExample;
import com.gym.web.model.UserExample.Criteria;
import com.gym.web.service.UserSer;

import java.util.List;
import java.util.Map;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("userSer")
@Transactional
public class UserSerImpl extends BaseServiceImpl<User> implements UserSer {

    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Resource
    public UserDao userDao;
    @Resource
    public TeacherDao teacherDao;
    @Resource
    public StudentDao studentDao;


    @Override
    protected BaseDao<User> getDao() {
        return userDao;
    }

    /**
     * 通过Uid查询User
     *
     * @param uid
     * @return
     */
    @Override
    public User findUserByUid(String uid) {
        UserExample example = new UserExample();
        Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(uid);
        List<User> users = userDao.selectByExample(example);
        if (users != null && users.size() > 0) {
            User user = users.get(0);
            return user;
        }
        return null;
    }

    @Override
    public List<User> getUser(Map<String, String> map) {
        UserExample example = new UserExample();
        Criteria criteria = example.createCriteria();

        if (StringHelper.isNotEmpty(map.get("Uid"))) {
            criteria.andUidEqualTo(map.get("Uid"));
        }
        if ("teacher".equals(map.get("role"))) {
            criteria.andIsteacherEqualTo("1");
        }
        if ("student".equals(map.get("role"))) {
            criteria.andIsteacherEqualTo("1");
        }

        List<User> users = userDao.selectByExample(example);
        return users;
    }

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    @Override
    public int deleteUserbyId(String id) {
        int i = userDao.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int countUserByUid(String uid) {
        int i;
        UserExample example = new UserExample();
        Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(uid);
        i = (int) userDao.countByExample(example);

        return i;
    }

    @Override
    public int updateUser(Map<String, String> map) {

        User user = findUserByUid(map.get("uid"));//原user记录
        user.setUid(map.get("uid"));
        user.setRole(map.get("role"));
        user.setUsername(map.get("username"));
        if (!StringHelper.isNotEmpty(map.get("userpwd"))) {
            user.setUserpwd(SecurityHelper.MD5(map.get("uid")));//密码默认与学号相同
        } else {
            user.setUserpwd(SecurityHelper.MD5(map.get("userpwd")));
        }
        user.setRemark(map.get("remark"));
        if ("teacher".equals(map.get("role"))) {
            user.setIsteacher("1");
        } else if ("student".equals(map.get("role"))) {
            user.setIsstudent("1");
        }
        user.setBlock("0");
        user.setIsadmin("0");

        //block->0,
        int i = userDao.updateByPrimaryKey(user);


        return i;
    }

    @Override
    public int addUser(Map<String, String> map) {

        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setRole(map.get("role"));
        user.setUid(map.get("uid"));
        user.setUsername(map.get("username"));

        user.setUserpwd(SecurityHelper.MD5(map.get("uid")));//密码默认与学号相同

        user.setRemark(map.get("remark"));
        if ("teacher".equals(map.get("role"))) {
            user.setIsteacher("1");
        } else if ("student".equals(map.get("role"))) {
            user.setIsstudent("1");
        }
        user.setBlock("0");
        user.setIsadmin("0");

        //block->0,
        int i = userDao.insert(user);
        return i;
    }

    @Override
    public int blockuser(String useruid, String status) {
        UserExample example = new UserExample();
        Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(useruid);
        User user = userDao.selectByExample(example).get(0);
        user.setBlock(status);
        int i = userDao.updateByExample(user, example);
        return i;
    }

    @Override
    public int resetpwd(String useruid) {
        UserExample example = new UserExample();
        Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(useruid);
        User user = userDao.selectByExample(example).get(0);

        user.setUserpwd(SecurityHelper.MD5(useruid));
        int i = userDao.updateByExample(user, example);
        return i;
    }

    @Override
    public int deluserByUid(String useruid) {

        //删除用户，删除教师学生表记录
        UserExample example = new UserExample();
        Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(useruid);
        int i = userDao.deleteByExample(example);
        Teacher teacher = teacherDao.selectByPrimaryKey(useruid);
        if (teacher != null) {
            teacherDao.deleteByPrimaryKey(useruid);
        }
        Student student = studentDao.selectByPrimaryKey(useruid);
        if (student != null) {
            studentDao.deleteByPrimaryKey(useruid);
        }
        return i;
    }


}
