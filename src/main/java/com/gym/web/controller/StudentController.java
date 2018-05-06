package com.gym.web.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gym.commons.helper.QueryParmFormat;
import com.gym.web.service.GxStuCourseSer;
import com.gym.web.service.PjcontextSer;
import com.gym.web.service.StudentSer;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentSer studentSer;
    @Autowired
    GxStuCourseSer gxStuCourseSer;
    @Autowired
    PjcontextSer pjcontextSer;

    @RequestMapping("/course/selectCourseView.shtm")
    public String selectCourseview() {
        return "student/course/course-list";

    }

    /**
     * 获取选课
     *
     * @param request
     * @return
     */
    @RequestMapping("/course/getCourse.shtm")
    @ResponseBody
    public JSONObject getCourse(HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();
        Map<String, String> querymap = QueryParmFormat.Format(request.getParameterMap());
        JSONArray jsonArray = new JSONArray();
        Subject currentUser = SecurityUtils.getSubject();
        String stuid = currentUser.getPrincipal().toString();
        querymap.put("stuid", stuid);

        jsonArray = studentSer.getCourse(querymap);
        jsonObject.put("courses", jsonArray);
        return jsonObject;
    }

    /**
     * 学生选课
     *
     * @param request
     * @return
     */
    @RequestMapping("/course/selectCourse.shtm")
    @ResponseBody
    public JSONObject selectCourse(HttpServletRequest request) {
        Subject currentUser = SecurityUtils.getSubject();
        String stuid = currentUser.getPrincipal().toString();//stuid

        JSONObject jsonObject = new JSONObject();
        String courseid = request.getParameter("courseid");//courseid
        int i = gxStuCourseSer.selectCourse(stuid, courseid);
        if (i > 0) {
            jsonObject.put("status", "success");
            jsonObject.put("msg", "选课成功");

        }
        return jsonObject;
    }

    @RequestMapping("/course/myCourseView.shtm")
    public String myCourseView() {
        return "student/course/course-list-mine";
    }

    @RequestMapping("/course/pingjiaoListView.shtm")
    public String pingjiaoListView(){
        return "student/course/course-list-pingjiao";
    }

    /**
     * 查看已选课程
     *
     * @param request
     * @return
     */
    @RequestMapping("/course/myCourse.shtm")
    @ResponseBody
    public JSONObject myCourse(HttpServletRequest request) {
        Map<String, String> querymap = QueryParmFormat.Format(request.getParameterMap());
        JSONObject jsonObject = new JSONObject();
        Subject currentUser = SecurityUtils.getSubject();
        String stuid = currentUser.getPrincipal().toString();
        querymap.put("stuid", stuid);
        JSONArray arry = gxStuCourseSer.getMyCourse(querymap);

        jsonObject.put("courses", arry);
        return jsonObject;
    }

    @RequestMapping("/course/recallcourse.shtm")
    @ResponseBody
    public JSONObject recallcourse(HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();
        Subject currentUser = SecurityUtils.getSubject();
        String stuid = currentUser.getPrincipal().toString();

        String courseid = request.getParameter("courseid");
        int i = gxStuCourseSer.recallCourse(stuid, courseid);
        if (i > 0) {
            jsonObject.put("msg", "课程退回成功");
            jsonObject.put("status", "success");

        }
        return jsonObject;
    }

    /**
     * 评教列表
     * @return
     */
    @RequestMapping("/course/pingjiaoList.shtm")
    @ResponseBody
    public JSONObject pingjiaoList(HttpServletRequest request){
        Map<String, String> querymap = QueryParmFormat.Format(request.getParameterMap());
        JSONObject jsonObject = new JSONObject();
        Subject currentUser = SecurityUtils.getSubject();
        String stuid = currentUser.getPrincipal().toString();
        querymap.put("stuid", stuid);

        JSONArray arry = gxStuCourseSer.getPingjiaoList(querymap);

        jsonObject.put("courses", arry);
        return jsonObject;

    }

    @RequestMapping("/course/pingjiaoView.shtm")
    public String pingjiaoView(HttpServletRequest request){
        String courseid=request.getParameter("courseid");
        Subject sub=SecurityUtils.getSubject();
        String stuId=sub.getPrincipal().toString();
        request.setAttribute("stuid",stuId);
        request.setAttribute("courseid",courseid);

        JSONArray array= pjcontextSer.getItems(courseid);//评教题目

        request.setAttribute("pingjiaoitems",array);

        return "student/pingjiao/pingjiao-list";
    }

}
