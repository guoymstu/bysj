package com.gym.web.controller;



import com.gym.web.service.ScopeDicSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 专业字典管理
 */
@Controller
@RequestMapping("/admin/major")
public class MajorController {

    @Autowired
    ScopeDicSer scopeDicSer;

    /**
     * 专业班级列表
     * @return
     */
    @RequestMapping("/majorlist")
    public String majorList(){

        return "admin/major/majorList";
    }

    /**
     * 添加班级
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/add")
    public  String addMajor(HttpServletRequest request, HttpServletResponse response){

//        Map<String,String> map= (Map<String, String>) request.getParameterMap();
//
//        Scopedic scopedic=new Scopedic();
//
//        scopedic.setId(UUID.randomUUID().toString());
//
//        scopedic.setNianji(map.get("nianji"));
//        scopedic.setYuanxi(map.get("yuanxi"));
//        scopedic.setZhuanye(map.get("zhuanye"));
//        scopedic.setBanji("banji");
//
//        scopeDicSer.add(scopedic);

        return  null;
    }





}
