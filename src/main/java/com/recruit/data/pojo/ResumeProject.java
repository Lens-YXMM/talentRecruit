package com.recruit.data.pojo;

import java.util.Date;

/**
 * @table resume_project 简历项目经验表
 */
public class ResumeProject {
    private Integer id;         // 主键id

    private Integer resumeId;   // 简历表主键

    private String name;        // 项目名称

    private String role;        // 职责

    private String detail;      // 详细内容包括项目介绍和项目成果

    private Date start;         // 开始日期，以此字段倒序排序

    private String end;         // 结束日期，若还未结束，则存入“至今”

    private Date createTime;

    private Date updateTime;

    public ResumeProject(Integer id, Integer resumeId, String name, String role, String detail, Date start, String end, Date createTime, Date updateTime) {
        this.id = id;
        this.resumeId = resumeId;
        this.name = name;
        this.role = role;
        this.detail = detail;
        this.start = start;
        this.end = end;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public ResumeProject() {
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end == null ? null : end.trim();
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