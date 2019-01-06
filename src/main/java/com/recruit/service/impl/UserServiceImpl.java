package com.recruit.service.impl;

import com.recruit.data.dao.UserMapper;
import com.recruit.data.pojo.User;
import com.recruit.service.UserService;
import com.recruit.web.interceptor.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public ServerResponse<User> signin(String username, String password) {
        int resultCount = userMapper.checkUsername(username);
        if(resultCount == 0 ){
            return ServerResponse.createByErrorMessage("用户名不存在");
        }

        //String md5Password = MD5Util.MD5EncodeUtf8(password);
        User user  = userMapper.checkSignin(username,password);
        if(user == null){
            return ServerResponse.createByErrorMessage("密码错误");
        }

        user.setPassword(null);
        return ServerResponse.createBySuccess("登录成功",user);
    }

}
