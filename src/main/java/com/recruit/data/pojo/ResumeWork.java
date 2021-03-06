package com.recruit.data.pojo;

import java.util.Date;

/**
 * @table resume_work 简历工作经历表
 */
public class ResumeWork {
    private Integer id;             // 主键id

    private Integer resumeId;       // 简历表主键

    private String name;            // 公司名称

    private String department;      // 所在部门名称

    private String position;        // 职位名称

    private String responsibility;  // 工作职责

    private Date start;             // 开始日期，以此字段倒序排序

    private String end;             // 结束日期，若还未结束，则存入“至今”

    private Date createTime;

    private Date updateTime;

    public ResumeWork(Integer id, Integer resumeId, String name, String department, String position, String responsibility, Date start, String end, Date createTime, Date updateTime) {
        this.id = id;
        this.resumeId = resumeId;
        this.name = name;
        this.department = department;
        this.position = position;
        this.responsibility = responsibility;
        this.start = start;
        this.end = end;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public ResumeWork() {
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility == null ? null : responsibility.trim();
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