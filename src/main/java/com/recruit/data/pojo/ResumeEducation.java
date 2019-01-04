package com.recruit.data.pojo;

import java.util.Date;

/**
 * @table resume_education 简历教育经历表
 */
public class ResumeEducation {
    private Integer id;         // 主键id

    private Integer resumeId;   // 简历表主键

    private String name;        // 学校名称

    private Date start;         // 入学年份，2014

    private Date end;           // 毕业年份，2018

    private String department;  // 所在学院名称

    private String major;       // 所学专业名称

    private Byte level;         // 毕业后所得学历1-博士，2-硕士，3-本科，4-大专，5-高中，6-其他

    private Byte ranking;       // 成绩排名1-Top5, 2-Top10, 3-Top25, 4-Top50, 5-其他

    private Date createTime;

    private Date updateTime;

    public ResumeEducation(Integer id, Integer resumeId, String name, Date start, Date end, String department, String major, Byte level, Byte ranking, Date createTime, Date updateTime) {
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

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public Byte getRanking() {
        return ranking;
    }

    public void setRanking(Byte ranking) {
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