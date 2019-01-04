package com.recruit.data.pojo;

import java.util.Date;

public class Department {
    private Integer id;

    private String introduction;

    private Integer location;

    private Integer number;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    public Department(Integer id, String introduction, Integer location, Integer number, Byte status, Date createTime, Date updateTime) {
        this.id = id;
        this.introduction = introduction;
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

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
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