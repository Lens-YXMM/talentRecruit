package com.recruit.data.pojo;

import java.util.Date;

/**
 * @table sys_department 部门信息表
 */
public class Department {
    private Integer id;             // 主键id

    private String name;            // 部门名称

    private Integer location;       // 部门所在地编码

    private Integer number;         // 部门人数

    private Byte status;            // 部门状态，默认1-启用，0-弃用

    private Date createTime;

    private Date updateTime;

    public Department(Integer id, String name, Integer location, Integer number, Byte status, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.number = number;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Department() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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