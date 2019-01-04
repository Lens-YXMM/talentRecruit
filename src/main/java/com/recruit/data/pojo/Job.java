package com.recruit.data.pojo;

import java.util.Date;

/**
 * @table sys_job 职位信息表
 */
public class Job {
    private Integer id;             // 主键id

    private Integer categoryId;     // 分类表主键

    private Integer deptId;         // 部门表主键

    private String name;            // 职位名称

    private Integer location;       // 职位所在城市

    private String responsibility;  // 职位内容、职责

    private String requirement;     // 职位要求

    private Byte recruitType;       // 招收类型：0-经验不限，1- 实习生，2-应届毕业生，3- 3年及一下，4- 3-5年，5- 5-10年，6-10年以上

    private Byte recruitEducation;  // 招收学历要求：1-博士，2-硕士，3-本科，4-大专

    private Integer recruitNum;     // 招收人数

    private Byte status;            // 职位状态：0-停用，默认1-启用

    private Date createTime;

    private Date updateTime;

    public Job(Integer id, Integer categoryId, Integer deptId, String name, Integer location, String responsibility, String requirement, Byte recruitType, Byte recruitEducation, Integer recruitNum, Byte status, Date createTime, Date updateTime) {
        this.id = id;
        this.categoryId = categoryId;
        this.deptId = deptId;
        this.name = name;
        this.location = location;
        this.responsibility = responsibility;
        this.requirement = requirement;
        this.recruitType = recruitType;
        this.recruitEducation = recruitEducation;
        this.recruitNum = recruitNum;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Job() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility == null ? null : responsibility.trim();
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement == null ? null : requirement.trim();
    }

    public Byte getRecruitType() {
        return recruitType;
    }

    public void setRecruitType(Byte recruitType) {
        this.recruitType = recruitType;
    }

    public Byte getRecruitEducation() {
        return recruitEducation;
    }

    public void setRecruitEducation(Byte recruitEducation) {
        this.recruitEducation = recruitEducation;
    }

    public Integer getRecruitNum() {
        return recruitNum;
    }

    public void setRecruitNum(Integer recruitNum) {
        this.recruitNum = recruitNum;
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