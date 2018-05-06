package com.gym.commons.helper;

import org.apache.shiro.crypto.hash.SimpleHash;

public class SecurityHelper {

    /**
     * MD5加密
     *
     * @param pwd
     * @return
     */
    public static String MD5(String pwd) {

        Object result = new SimpleHash("MD5", pwd, null, 1);
        return result.toString();
    }

    public static void main(String[] args) {
        String pwd = MD5("123456");
        System.out.println(pwd);
    }
}
