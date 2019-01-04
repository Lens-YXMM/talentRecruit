package com.recruit.data.pojo;

import java.util.Date;

/**
 * @table resume_job_preferrance 工作意向表
 */
public class ResumeJobPreferrance {
    private Integer id;         // 主键id

    private Integer resumeId;   // 简历表主键

    private Integer jobId;      // 职位表主键

    private String salaryRange; // 薪资范围，如7-8，单位为k

    private Integer firstCity;  // 第一意向城市编码

    private Integer secondCity; // 第二意向城市编码

    private Byte employDate;    // 可接受入职时间，1-随时，2-1个月以内，3-1-3个月，4-3个月以上

    private Date createTime;

    private Date updateTime;

    public ResumeJobPreferrance(Integer id, Integer resumeId, Integer jobId, String salaryRange, Integer firstCity, Integer secondCity, Byte employDate, Date createTime, Date updateTime) {
        this.id = id;
        this.resumeId = resumeId;
        this.jobId = jobId;
        this.salaryRange = salaryRange;
        this.firstCity = firstCity;
        this.secondCity = secondCity;
        this.employDate = employDate;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public ResumeJobPreferrance() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getSalaryRange() {
        return salaryRange;
    }

    public void setSalaryRange(String salaryRange) {
        this.salaryRange = salaryRange == null ? null : salaryRange.trim();
    }

    public Integer getFirstCity() {
        return firstCity;
    }

    public void setFirstCity(Integer firstCity) {
        this.firstCity = firstCity;
    }

    public Integer getSecondCity() {
        return secondCity;
    }

    public void setSecondCity(Integer secondCity) {
        this.secondCity = secondCity;
    }

    public Byte getEmployDate() {
        return employDate;
    }

    public void setEmployDate(Byte employDate) {
        this.employDate = employDate;
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