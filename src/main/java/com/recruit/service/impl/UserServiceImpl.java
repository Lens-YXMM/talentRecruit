package com.recruit.service.impl;

import com.recruit.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.recruit.data.entity.User;
import com.recruit.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    User user = new User();

    @Autowired
    private UserDao userDao;

    @Override
    public User loginUser(String account, String password) {
        user = userDao.getLoginResult(account,password);
        return user;
    }

    @Override
    public int loginUser(String account, String password, String ipAddr, String resolution, String browser){
        int result = 0;
        return result;
    }
}
