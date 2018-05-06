package com.gym.web.shiro;

import com.gym.web.model.User;
import com.gym.web.service.UserSer;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class MyRealm extends AuthorizingRealm {
    private static final Logger log = LoggerFactory.getLogger(MyRealm.class);
     @Resource
    UserSer userSer;

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken Uptoken = (UsernamePasswordToken)authenticationToken;
        String username = Uptoken.getUsername();
        User user = null;

        try {
            user = this.userSer.findUserByUid(username);
        } catch (Exception var6) {
            log.error("sqlError" + this.getClass());
            var6.printStackTrace();
        }

        if (null != user) {
            if("1".equals(user.getBlock())){
                throw new LockedAccountException("用户被锁定！");
            }
            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getUid(), user.getUserpwd(), this.getName());
            return authcInfo;
        } else {
            throw new UnknownAccountException("用户不存在！");
        }
    }

    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String uid = (String)super.getAvailablePrincipal(principals);
        System.out.println("当前登录用户授予角色和权限!");
        User user = this.userSer.findUserByUid(uid);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        if (null != user) {
            if ("1".equals(user.getIsadmin())) {
                info.addRole("admin");
                System.out.println("admin");
            }

            if ("1".equals(user.getIsteacher())) {
                info.addRole("teacher");
                System.out.println("teacher");
            }

            if ("1".equals(user.getIsstudent())) {
                info.addRole("student");
                System.out.println("student");
            }

            return info;
        } else {
            throw new AuthorizationException();
        }
    }

    public void onLogout(PrincipalCollection principals) {
        System.out.println("用户退出:" + principals.toString());
        super.onLogout(principals);
    }


}
