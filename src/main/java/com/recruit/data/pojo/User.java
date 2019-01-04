package com.recruit.data.pojo;

import java.lang.Byte;
import java.util.Date;

/**
 * @table sys_user 用户表
 */
public class User {
    private Integer id;         // 主键id

    private String username;    // 用户名(唯一索引）

    private String password;    // 密码

    private String phone;       // 手机号码

    private String email;       // 邮箱地址

    private String name;        // 姓名

    private Byte gender;        // 性别默认1-男，0-女

    private Date birthday;      // 生日，1999-1-1

    private Integer role;       // 角色0-管理员，1-人力资源专员，2-个人用户

    private Byte blacked;       // 是否拉黑，默认为0-未拉黑，1-已拉黑

    private Date createTime;

    private Date updateTime;

    public User(Integer id, String username, String password, String phone, String email, String name, Byte gender, Date birthday, Integer role, Byte blacked, Date createTime, Date updateTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.role = role;
        this.blacked = blacked;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Byte getBlacked() {
        return blacked;
    }

    public void setBlacked(Byte blacked) {
        this.blacked = blacked;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}