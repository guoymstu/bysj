package com.gym.web.shiro;


import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;

/**
 * 安全工具类
 */
public final class SecurityHelper {


    public static String getMD5(String pwd){
        String method="MD5";
        Object result=new SimpleHash(method,pwd,null,1);
        return result.toString();
    }





    /**
     * 构建用户token信息
     * @param id 主键信息
     * @param account 账号
     * @return token串
     */
    public static String buildSecurityString(String id, String account){
        return id+"@@@"+ account;
    }

    /**
     * 取得当前验证信息
     * @return 验证信息数组0:id,1:account
     */
    public static String[] getSecurityInfo(){
        Subject subject = SecurityUtils.getSubject();
        return getSecurityInfo(subject);
    }

    /**
     * 取得指定对象的验证信息
     * @param subject 指定对象
     * @return 验证信息数组0:id,1:account
     */
    public static String[] getSecurityInfo(Subject subject){
        if(subject == null)
            return null;
        String securityInfo = (String) subject.getPrincipal();
        return parseSecurityInfo(securityInfo);
    }

    /**
     * 取得指定对象的验证信息
     * @param securityInfo 安全信息串
     * @return 验证信息数组0:id,1:account
     */
    public static String[] parseSecurityInfo(String securityInfo){
        if(StringUtils.isEmpty(securityInfo))
            return null;
        String[] rs = securityInfo.split("@@@",2);
        if(rs.length < 2)
            return null;
        return rs;
    }
}
