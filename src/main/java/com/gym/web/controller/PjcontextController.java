package com.gym.web.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gym.commons.helper.QueryParmFormat;
import com.gym.web.service.DicCourseTypeSer;
import com.gym.web.service.PjcontextSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/admin/pingjiao")
public class PjcontextController {
    JSONObject jsonObject;
    JSONArray jsonArray;

    @Autowired
    DicCourseTypeSer dicCourseTypeSer;

    @Autowired
    PjcontextSer pjcontextSer;

    /**
     * 评教列表
     *
     * @return
     */
    @RequestMapping("/pingjiaoList.shtm")
    public String courseList() {
        return "admin/pingjiao/pingjiao-list";
    }

    /**
     * 添加评教
     *
     * @param request
     * @return
     */
    @RequestMapping("/pingjiaoadd.shtm")
    @ResponseBody
    public JSONObject pingjiaoadd(HttpServletRequest request) {

        JSONObject jsonObject = new JSONObject();
        Map<String, String> paramap = QueryParmFormat.Format(request.getParameterMap());

        int i=pjcontextSer.countById(paramap.get("id"));
        if(i>0){
            jsonObject.put("msg", "添加评教失败,该题目编号已存在");
            jsonObject.put("status", "fail");
            return jsonObject;
        }

        int j = pjcontextSer.addPingjiao(paramap);

        jsonObject.put("msg", "添加评教成功");
        jsonObject.put("status", "success");
        return jsonObject;
    }

    /**
     * 添加评教 表单
     *
     * @param request
     * @return
     */
    @RequestMapping("/addPingjiaoForm.shtm")
    public String addPingjiaoForm(HttpServletRequest request) {
        //课程类型
        JSONArray coursetypes = dicCourseTypeSer.getCourseType();
        request.setAttribute("coursetypes", coursetypes);

        return "admin/pingjiao/pingjiao-add";
    }

    /**
     * 获取评教项
     *
     * @param request
     * @return
     */
    @RequestMapping("/getPingjiao.shtm")
    @ResponseBody
    public JSONObject getPingjiao(HttpServletRequest request) {
        Map<String, String> querymap = QueryParmFormat.Format(request.getParameterMap());
        JSONObject jsonObject = new JSONObject();

        jsonArray = pjcontextSer.getPjcontext(querymap);
        jsonObject.put("pingjiaos", jsonArray);
        return jsonObject;
    }



    /**
     * 锁定/启用评教
     * @param request
     * @return
     */
    @RequestMapping("/blockPingjiao.shtm")
    @ResponseBody
    public JSONObject blockPingjiao(HttpServletRequest request) {
        return jsonObject;
    }

    @RequestMapping("/delPingjiao.shtm")
    @ResponseBody
    public JSONObject delpingjiao(HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();
        String pjId = request.getParameter("pingjiaoid");
        int i = pjcontextSer.delPingjiaoById(pjId);
        if (i > 0) {
            jsonObject.put("msg", "删除成功");
            jsonObject.put("status", "success");
        }
        return jsonObject;
    }

}
