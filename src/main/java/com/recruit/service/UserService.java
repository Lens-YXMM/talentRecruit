package com.recruit.service;


import com.recruit.data.pojo.User;
import com.recruit.web.interceptor.ServerResponse;

public interface UserService {

    ServerResponse<User> signin(String account, String password);

}
