package com.recruit.data.pojo;

import java.util.Date;

/**
 * @table sys_employee 职员信息表
 */
public class Employee {
    private Integer id;             // 主键id

    private Integer jobId;          // 职位表主键

    private Integer deptId;         // 部门表主键

    private Integer location;       // 所在地区编号

    private String name;            // 员工姓名

    private Byte gender;            // 员工性别，0-女，1-男

    private Byte status;            // 入职状态：0-实习（包括管培生），1-试用，2-正式，3-离职

    private Date traineeStart;      // 实习开始日期

    private Date traineeEnd;        // 实习结束日期

    private Date probationStart;    // 试用开始日期

    private Date probationEnd;      // 试用结束日期

    private Date regularDate;       // 转正日期

    private Date dimissionDate;     // 离职日期

    private Date createTime;

    private Date updateTime;

    public Employee(Integer id, Integer jobId, Integer deptId, Integer location, String name, Byte gender, Byte status, Date traineeStart, Date traineeEnd, Date probationStart, Date probationEnd, Date regularDate, Date dimissionDate, Date createTime, Date updateTime) {
        this.id = id;
        this.jobId = jobId;
        this.deptId = deptId;
        this.location = location;
        this.name = name;
        this.gender = gender;
        this.status = status;
        this.traineeStart = traineeStart;
        this.traineeEnd = traineeEnd;
        this.probationStart = probationStart;
        this.probationEnd = probationEnd;
        this.regularDate = regularDate;
        this.dimissionDate = dimissionDate;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Employee() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getTraineeStart() {
        return traineeStart;
    }

    public void setTraineeStart(Date traineeStart) {
        this.traineeStart = traineeStart;
    }

    public Date getTraineeEnd() {
        return traineeEnd;
    }

    public void setTraineeEnd(Date traineeEnd) {
        this.traineeEnd = traineeEnd;
    }

    public Date getProbationStart() {
        return probationStart;
    }

    public void setProbationStart(Date probationStart) {
        this.probationStart = probationStart;
    }

    public Date getProbationEnd() {
        return probationEnd;
    }

    public void setProbationEnd(Date probationEnd) {
        this.probationEnd = probationEnd;
    }

    public Date getRegularDate() {
        return regularDate;
    }

    public void setRegularDate(Date regularDate) {
        this.regularDate = regularDate;
    }

    public Date getDimissionDate() {
        return dimissionDate;
    }

    public void setDimissionDate(Date dimissionDate) {
        this.dimissionDate = dimissionDate;
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