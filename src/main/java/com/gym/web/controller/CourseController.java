package com.gym.web.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gym.commons.helper.QueryParmFormat;
import com.gym.web.model.Course;
import com.gym.web.service.CourseSer;
import com.gym.web.service.DicCourseTypeSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@Controller
@RequestMapping("/admin/course")
public class CourseController {

    @Autowired
    CourseSer courseSer;

    @Autowired
    DicCourseTypeSer dicCourseTypeSer;

    /**
     * 课程View
     *
     * @return
     */
    @RequestMapping("/courseList.shtm")
    public String courseList() {
        return "admin/course/course-list";
    }

    /**
     * 添加课程view
     *
     * @return
     */
    @RequestMapping("/course-add.shtm")
    public String courseadd(HttpServletRequest request) {
        //课程类型
        JSONArray coursetypes = dicCourseTypeSer.getCourseType();
        request.setAttribute("coursetypes", coursetypes);//课程类型

        return "admin/course/course-add";
    }

    /**
     * 获取课程
     *
     * @param req
     * @return
     */
    @RequestMapping("/getCourse.shtm")
    @ResponseBody
    public JSONObject getcourse(HttpServletRequest req) {
        Map<String, String> querymap = QueryParmFormat.Format(req.getParameterMap());

        JSONObject jsonObject = new JSONObject();
        JSONArray courseList = courseSer.findCourse(querymap);
        jsonObject.put("courses", courseList);
        return jsonObject;
    }

    /**
     * 保存课程
     */
    @RequestMapping("/saveCourse.shtm")
    @ResponseBody
    public JSONObject saveCourse(HttpServletRequest req) {
        Map<String, String> querymap = QueryParmFormat.Format(req.getParameterMap());
        JSONObject jsonObject = new JSONObject();
       String courseid= querymap.get("courseid");
        Course course = courseSer.findByPrimaryKey(courseid);
        if (course != null) {//更新课程
            int i=courseSer.updataCourse(querymap);
            if (i > 0) {
                jsonObject.put("msg", "更新课程成功");
                jsonObject.put("status", "success");
                return jsonObject;
            }
        }else{//添加课程
            int i = courseSer.saveCourse(querymap);
            if (i > 0) {
                jsonObject.put("msg", "添加课程成功");
                jsonObject.put("status", "success");
                return jsonObject;
            }
        }
        return jsonObject;
    }

    @RequestMapping("/editCourse.shtm")
    public String editCourse(HttpServletRequest request) {
        String courseid = request.getParameter("courseid");
        Course course = courseSer.findByPrimaryKey(courseid);
        request.setAttribute("course", course);
        return "admin/course/course-edit";
    }


    /**
     * 删除课程
     *
     * @param request
     * @return
     */
    @RequestMapping("/delcourse.shtm")
    @ResponseBody
    public JSONObject delcourse(HttpServletRequest request) {

        JSONObject jsonObject = new JSONObject();
        String courseid = request.getParameter("courseid");
        int i = courseSer.delCourseByid(courseid);
        if (i > 0) {
            jsonObject.put("status", "success");
            return jsonObject;
        }
        return jsonObject;

    }


}
