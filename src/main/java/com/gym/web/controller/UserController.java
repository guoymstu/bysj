package com.gym.web.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gym.commons.helper.QueryParmFormat;
import com.gym.web.model.Student;
import com.gym.web.model.Teacher;
import com.gym.web.model.User;
import com.gym.web.service.ScopeDicSer;
import com.gym.web.service.StudentSer;
import com.gym.web.service.TeacherSer;
import com.gym.web.service.UserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import java.util.List;
import java.util.Map;

@Scope("prototype")
@Controller
@RequestMapping("/admin/user")
public class UserController {
    @Autowired
    UserSer userSer;

    @Autowired
    TeacherSer teacherSer;

    @Autowired
    StudentSer studentSer;

    @Autowired
    ScopeDicSer scopeDicSer;

    JSONArray jsonArray;

    /**
     * 用户列表-view
     *
     * @return
     */
    @RequestMapping("/userList.shtm")
    public String userList() {
        return "admin/user/user-list";
    }

    /**
     * 获取所有用户
     *
     * @param req
     * @return
     */
    @RequestMapping("/getUser.shtm")
    @ResponseBody
    public JSONObject getUsers(HttpServletRequest req) {
        Map<String, String> querymap = QueryParmFormat.Format(req.getParameterMap());
        JSONObject jsonObject = new JSONObject();

        if ("teacher".equals(querymap.get("role"))) {
            List<Map<String, Object>> teacherList = teacherSer.findTeacher(querymap);
            jsonArray = JSONArray.parseArray(JSON.toJSONString(teacherList));
            jsonObject.put("users", jsonArray);
            System.out.println(jsonObject);
            return jsonObject;
        }
        if ("student".equals(querymap.get("role"))) {
            List<Map<String, Object>> studentList = studentSer.findStudent(querymap);
            jsonArray = JSONArray.parseArray(JSON.toJSONString(studentList));
            jsonObject.put("users", jsonArray);
            System.out.println(jsonObject);
            return jsonObject;
        }
        return null;
    }


    @RequestMapping("/user-add.shtm")
    public String addUser(HttpServletRequest request) {
        String role = request.getParameter("role");
        request.setAttribute("role", role);
        if ("teacher".equals(role)) {
            //院系，职称，
            JSONArray yuanxis = scopeDicSer.getYuanxi();
            request.setAttribute("yuanxis", yuanxis);

            return "admin/user/user-add-teacher";
        }

        if ("student".equals(role)) {
            JSONArray nianjis = scopeDicSer.getNianji();
            JSONArray yuanxis = scopeDicSer.getYuanxi();
            JSONArray banjis = scopeDicSer.getAll();
            JSONArray zhuanyes = scopeDicSer.getZhuanye();

            request.setAttribute("nianjis", nianjis);
            request.setAttribute("yuanxis", yuanxis);
            request.setAttribute("zhuanyes", zhuanyes);
            request.setAttribute("banjis", banjis);
            return "admin/user/user-add-student";
        }
        return null;
    }


    @RequestMapping("/adduser.shtm")
    @ResponseBody
    public JSONObject saveuser(HttpServletRequest req, Teacher teacher) {
        JSONObject jsonObject = new JSONObject();
        Map<String, String> pqramMap = QueryParmFormat.Format(req.getParameterMap());
        int userCount = userSer.countUserByUid(pqramMap.get("uid"));
        if ("teacher".equals(pqramMap.get("role"))) {
            if (userCount > 0) {//用户已存在,进行更新
                //更新用户
                //更新教师
                userSer.updateUser(pqramMap);
                teacherSer.updateTeacher(pqramMap);
                jsonObject.put("msg", "用户已更新");
                jsonObject.put("status", "success");
                return jsonObject;
            } else {//添加教师
                int i = userSer.addUser(pqramMap);
                int j = teacherSer.addTeacher(pqramMap);
                jsonObject.put("msg", "添加教师成功");
                jsonObject.put("status", "success");
                return jsonObject;
            }
        }

        if ("student".equals(pqramMap.get("role"))) {
            if (userCount > 0) {//用户已存在,进行更新
                userSer.updateUser(pqramMap);
                studentSer.updateStudent(pqramMap);
                req.setAttribute("msg", "用户已更新");
                jsonObject.put("status", "success");
                return jsonObject;
            } else {//添加学生
                int i = userSer.addUser(pqramMap);
                int j = studentSer.addStudent(pqramMap);
                jsonObject.put("msg", "添加学生成功");
                jsonObject.put("status", "success");
                return jsonObject;
            }
        }
        return jsonObject;

    }

    @RequestMapping("/blockuser.shtm")
    @ResponseBody
    public JSONObject blockUser(HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();
        String useruid = request.getParameter("useruid");
        String status = request.getParameter("status");
        int i = userSer.blockuser(useruid, status);
        if (i > 0) {
            jsonObject.put("status", "success");
            return jsonObject;
        }
        return jsonObject;
    }

    @RequestMapping("/user-edit.shtm")
    public String editUser(HttpServletRequest request) {
        String uid = request.getParameter("uid");
        User user = userSer.findUserByUid(uid);
        if ("teacher".equals(user.getRole())) {
            JSONArray yuanxis = scopeDicSer.getYuanxi();
            Teacher teacher = teacherSer.findByPrimaryKey(uid);
            request.setAttribute("teacher", teacher);
            request.setAttribute("yuanxis", yuanxis);
        }
        if ("student".equals(user.getRole())) {

            JSONArray yuanxis = scopeDicSer.getYuanxi();
            JSONArray zhuanyes = scopeDicSer.getZhuanye();
            JSONArray banjis = scopeDicSer.getAll();

            Student student = studentSer.findByPrimaryKey(uid);
            request.setAttribute("student", student);
            request.setAttribute("yuanxis", yuanxis);
            request.setAttribute("zhuanyes", zhuanyes);
            request.setAttribute("banjis", banjis);
        }

        return "admin/user/user-edit";
    }

    @RequestMapping("/resetpwd.shtm")
    @ResponseBody
    public JSONObject resetpwd(HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();
        String useruid = request.getParameter("useruid");
        int i = userSer.resetpwd(useruid);
        if (i > 0) {
            jsonObject.put("status", "success");
            return jsonObject;
        }
        return jsonObject;
    }

    /**
     * 删除用户
     * @param request
     * @return
     */
    @RequestMapping("/deluser.shtm")
    @ResponseBody
    public JSONObject deluser(HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();
        String useruid = request.getParameter("useruid");
        int i = userSer.deluserByUid(useruid);
        if (i > 0) {
            jsonObject.put("status", "success");
            return jsonObject;
        }
        return jsonObject;

    }


}
