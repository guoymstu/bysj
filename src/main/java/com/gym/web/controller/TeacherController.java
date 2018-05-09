package com.gym.web.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gym.commons.helper.QueryParmFormat;
import com.gym.web.service.GxTeaCourseSer;
import com.gym.web.service.PjRecordSer;
import com.gym.web.service.TeacherSer;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherSer teacherSer;
    @Autowired
    GxTeaCourseSer gxTeaCourseSer;
    @Autowired
    PjRecordSer pjRecordSer;


    @RequestMapping("/course/selectCourse.shtm")
    public String selectCourse() {
        return "teacher/course/course-list";

    }


    @RequestMapping("/course/getCourse.shtm")
    @ResponseBody
    public JSONObject getCourse(HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray;
        Map<String, String> querymap = QueryParmFormat.Format(request.getParameterMap());
        jsonArray = teacherSer.getCourse(querymap);
        jsonObject.put("courses", jsonArray);
        return jsonObject;

    }

    /**
     * 教师选课
     *
     * @param request
     * @return
     */
    @RequestMapping("/course/selcourse.shtm")
    @ResponseBody
    public JSONObject selCourse(HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();
        Subject currentUser = SecurityUtils.getSubject();
        String teaId = currentUser.getPrincipal().toString();

        String courseid = request.getParameter("courseid");

        int i = gxTeaCourseSer.record(teaId, courseid);

        if (i > 0) {
            jsonObject.put("status", "success");
            jsonObject.put("msg", "选课成功");
        }

        return jsonObject;
    }


    @RequestMapping("/course/mycourse.shtm")
    public String myCourseView() {
        return "teacher/course/course-list-mine";
    }

    /**
     * 获取教师自选课程
     * @param request
     * @return
     */
    @RequestMapping("/course/getMyCourse.shtm")
    @ResponseBody
    public JSONObject getMyCourse(HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();
         Map<String, String> querymap = QueryParmFormat.Format(request.getParameterMap());
        JSONArray arry;

        Subject currentUser=SecurityUtils.getSubject();
        String teaId=currentUser.getPrincipal().toString();
        querymap.put("teaId",teaId);

        arry =gxTeaCourseSer.getMyCourse(querymap);
        jsonObject.put("courses",arry);
        return jsonObject;
    }

    /**
     * 教师退回课程
     *
     * @param request
     * @return
     */
    @RequestMapping("/course/recallcourse.shtm")
    @ResponseBody
    public JSONObject recallCourse(HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();

        Subject currentUser = SecurityUtils.getSubject();
        String teaId = currentUser.getPrincipal().toString();
        String courseId = request.getParameter("courseid");
        int i = gxTeaCourseSer.recallCourse(teaId, courseId);

        if (i > 0) {
            jsonObject.put("msg", "退回成功");
            jsonObject.put("status", "success");
            return jsonObject;
        }
        return jsonObject;
    }

    /**
     * 我的评价View
     * @param request
     * @return
     */
    @RequestMapping("/pingjiao/myPingjiaoView.shtm")
    public String myPingjiaoView(HttpServletRequest request) {

        Subject currentUser = SecurityUtils.getSubject();
        String teaId = currentUser.getPrincipal().toString();

        //获取平均得分
        JSONArray marks= pjRecordSer.getAvgmark(teaId);
        JSONArray remarks=pjRecordSer.getRemarks(teaId);
        request.setAttribute("marks",marks);
        request.setAttribute("remarks",remarks);

        return "/teacher/pingjiao/myPingjiao-view";
    }

    @RequestMapping("/info/myPingjiaoView.shtm")
    public String infoEdit(HttpServletRequest request) {

        Subject currentUser = SecurityUtils.getSubject();
        String teaId = currentUser.getPrincipal().toString();



        return "/teacher/pingjiao/myPingjiao-view";
    }


}
