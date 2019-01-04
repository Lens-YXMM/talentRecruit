package com.recruit.data.pojo;

import java.util.Date;

public class ResumeEducation {
    private Integer id;

    private Integer resumeId;

    private String name;

    private Date start;

    private Date end;

    private String department;

    private String major;

    private Boolean level;

    private Boolean ranking;

    private Date createTime;

    private Date updateTime;

    public ResumeEducation(Integer id, Integer resumeId, String name, Date start, Date end, String department, String major, Boolean level, Boolean ranking, Date createTime, Date updateTime) {
        this.id = id;
        this.resumeId = resumeId;
        this.name = name;
        this.start = start;
        this.end = end;
        this.department = department;
        this.major = major;
        this.level = level;
        this.ranking = ranking;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public ResumeEducation() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public Boolean getLevel() {
        return level;
    }

    public void setLevel(Boolean level) {
        this.level = level;
    }

    public Boolean getRanking() {
        return ranking;
    }

    public void setRanking(Boolean ranking) {
        this.ranking = ranking;
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