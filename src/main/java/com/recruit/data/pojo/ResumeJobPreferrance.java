package com.recruit.data.pojo;

import java.util.Date;

public class ResumeJobPreferrance {
    private Integer id;

    private Integer resumeId;

    private Integer jobId;

    private String salaryRange;

    private Integer firstCity;

    private Integer secondCity;

    private Byte employDate;

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