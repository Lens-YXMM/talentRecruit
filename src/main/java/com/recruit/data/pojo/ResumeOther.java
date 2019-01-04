package com.recruit.data.pojo;

import java.util.Date;

public class ResumeOther {
    private Integer id;

    private Integer resumeId;

    private String title;

    private String description;

    private Date createTime;

    private Date updateTime;

    public ResumeOther(Integer id, Integer resumeId, String title, String description, Date createTime, Date updateTime) {
        this.id = id;
        this.resumeId = resumeId;
        this.title = title;
        this.description = description;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public ResumeOther() {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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