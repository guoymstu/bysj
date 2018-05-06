package com.gym.web.controller;

import com.gym.commons.helper.RandomValidateCodeHelper;
import com.gym.web.model.User;
import com.gym.web.service.UserSer;

import org.apache.shiro.SecurityUtils;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserSer userSer;

    private static transient final Logger log = LoggerFactory.getLogger(LoginController.class);
    /**
     * 登录页
     *
     * @return
     */
    @RequestMapping("/login.shtm")
    public String login() {

        Subject currentUser=SecurityUtils.getSubject();
        if(currentUser.isAuthenticated()){
            return "redirect:/index.shtm";
        }
        return "login";
    }

    /**
     * 登录验证
     *
     * @return
     */

    @ResponseBody
    @RequestMapping("/authLogin.chtm")
    public Map<String, Object> authLogin(HttpServletRequest request, HttpServletResponse response, User userao) {

        Map<String, Object> result = new HashMap<>();
        result.put("success", false);
        //1：获取页面用户名和密码，验证码
        //2：比对验证码
        //3：创建subject
        //4: 登录
        String username = request.getParameter("username");//1
        String password = request.getParameter("password");
        String inputCode = request.getParameter("validateCode");

        String yCode = request.getSession().getAttribute("RANDOMVALIDATECODEKEY").toString();//2
        if (!(yCode != null && yCode.equals(inputCode))) {
            result.put("msg", "验证码输入错误！");
            result.put("status", "validateCode");
            return result;
        }

        Subject currentUser = SecurityUtils.getSubject();
        if (!currentUser.isAuthenticated()) {
            UsernamePasswordToken upToken = new UsernamePasswordToken(username, password);
            try {
                //调用shiro验证登录信息
                currentUser.login(upToken);
                result.put("status", true);
                result.put("success", true);
                return result;
            } catch (UnknownAccountException e) {
                result.put("status", "username");
                result.put("msg", "账号不存在");
            } catch (IncorrectCredentialsException e) {
                result.put("status", "password");
                result.put("msg", "密码输入错误");
            } catch (LockedAccountException e) {
                result.put("msg", "用户被锁定");
            }
        } else {
            result.put("success", true);
            result.put("status", true);
        }
        return result;
    }

    /**
     *
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/index.shtm")
    public String index(Model model, HttpServletRequest request, HttpServletResponse response) {

        Subject currentUser = SecurityUtils.getSubject();

        if (currentUser.hasRole("admin")) {
            return "redirect:/admin.shtm";
        }

        if (currentUser.hasRole("teacher")) {
            return "redirect:/teacher.shtm";
        }
        if (currentUser.hasRole("student")) {
            return "redirect:/student.shtm";
        }

        model.addAttribute("errorMsg", "您暂无权限");
        return "error/error";
    }

    /**
     * 用于生成验证码
     *
     * @param req
     * @param response
     * @return
     */
    @RequestMapping("/randomValidateCode.chtm")
    public void randomValidateCode(HttpServletRequest req, HttpServletResponse response) {
        response.setContentType("image/jpeg");//设置相应类型,告诉浏览器输出的内容为图片
        response.setHeader("Pragma", "No-cache");//设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);
        RandomValidateCodeHelper randomValidateCode = new RandomValidateCodeHelper();
        try {
            randomValidateCode.getRandcode(req, response);//输出图片方法
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @RequestMapping("/admin.shtm")
    public String admin() {
        return "decorators/admin";
    }

    @RequestMapping("/teacher.shtm")
    public String teacher() {
        return "decorators/teacher";
    }

    @RequestMapping("/student.shtm")
    public String student() {
        return "decorators/student";
    }


    /**
     * 登出
     * @return
     */
    @RequestMapping("/loginout.shtm")
    public String loginout() {

        Subject currentUser = SecurityUtils.getSubject();
        if (currentUser.isAuthenticated()) {
            currentUser.logout();
        }
        return "redirect:/login.shtm";

    }



}
