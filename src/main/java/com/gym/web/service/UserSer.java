package com.gym.web.service;


import com.gym.commons.service.BaseService;
import com.gym.web.model.User;

import java.util.List;
import java.util.Map;

public interface UserSer extends BaseService<User> {

    User findUserByUid(String username);

    List<User> getUser(Map<String, String> map);

    int deleteUserbyId(String id);

    int countUserByUid(String uid);

    int updateUser(Map<String, String> map);

    int addUser(Map<String, String> pqramMap);

    int blockuser(String useruid, String status);

    int resetpwd(String useruid);

    int deluserByUid(String useruid);
}
