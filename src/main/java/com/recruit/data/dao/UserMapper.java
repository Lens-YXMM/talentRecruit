package com.recruit.data.dao;

import com.recruit.data.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    /**
     * 注册插入用户个人信息
     * @param record 用户信息
     * @return 影响行数
     */
    int insert(User record);

    /**
     * 获取用户信息
     * @param id 登录用户id
     * @return  User 用户信息类实例对象
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 更新部分用户个人信息
     * @param record 用户信息
     * @return  影响行数
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * 更新全部用户个人信息
     * @param record 用户信息
     * @return  影响行数
     */
    int updateByPrimaryKey(User record);

    /**
     * 登录验证用户名与密码
     * @param username 用户名
     * @param password  密码
     * @return User 用户表的用户名与密码
     */
    User checkSignin(@Param("username")String username, @Param("password")String password);

    /**
     * 检查用户名是否存在
     * @param username 用户名
     * @return 0-无，1-存在
     */
    int checkUsername(String username);

    /**
     * 更新用户密码
     * @param username 用户密码
     * @param passwordNew 新密码
     * @return 影响行数
     */
    int updatePasswordByUsername(@Param("username")String username,@Param("passwordNew")String passwordNew);

    /**
     * 验证密码是否正确
     * @param password （原）密码
     * @param userId    用户id
     * @return
     */
    int checkPassword(@Param("password")String password,@Param("userId")Integer userId);
}