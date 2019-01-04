package com.recruit.data.pojo;

import java.util.Date;

/**
 * @table sys_recruiting_record 应聘记录表
 */
public class RecruitingRecord {
    private Integer id;                 // 主键id

    private Integer userId;             // 用户表主键

    private Integer jobId;              // 职位表主键

    private String department;          // 所选职位所在部门

    private String location;            // 所选职位所在地区

    private Byte status;                // 当前阶段：0-简历初筛，1-笔试，2-面试，3-入职

    private Byte resumePass;            // 简历初筛是否通过，1-通过，0-不通过

    private Date resumeDate;            // 简历初筛通过日期

    private Byte examGrade;             // 笔试成绩

    private Date examDate;              // 笔试日期

    private Byte examPass;              // 笔试是否通过，0-未通过，1-已通过

    private String interviewRecord;     // 面试情况记录

    private Date interviewDate;         // 面试日期

    private Byte interviewPass;         // 面试是否通过，0-未通过，1-已通过

    private Byte healthy;               // 体检是否通过，0-未通过，1-已通过

    private Date trainingStart;         // 培训开始日期

    private Date trainingEnd;           // 培训结束日期

    private String trainingRecord;      // 培训记录

    private Date createTime;

    private Date updateTime;

    public RecruitingRecord(Integer id, Integer userId, Integer jobId, String department, String location, Byte status, Byte resumePass, Date resumeDate, Byte examGrade, Date examDate, Byte examPass, String interviewRecord, Date interviewDate, Byte interviewPass, Byte healthy, Date trainingStart, Date trainingEnd, String trainingRecord, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.jobId = jobId;
        this.department = department;
        this.location = location;
        this.status = status;
        this.resumePass = resumePass;
        this.resumeDate = resumeDate;
        this.examGrade = examGrade;
        this.examDate = examDate;
        this.examPass = examPass;
        this.interviewRecord = interviewRecord;
        this.interviewDate = interviewDate;
        this.interviewPass = interviewPass;
        this.healthy = healthy;
        this.trainingStart = trainingStart;
        this.trainingEnd = trainingEnd;
        this.trainingRecord = trainingRecord;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public RecruitingRecord() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getResumePass() {
        return resumePass;
    }

    public void setResumePass(Byte resumePass) {
        this.resumePass = resumePass;
    }

    public Date getResumeDate() {
        return resumeDate;
    }

    public void setResumeDate(Date resumeDate) {
        this.resumeDate = resumeDate;
    }

    public Byte getExamGrade() {
        return examGrade;
    }

    public void setExamGrade(Byte examGrade) {
        this.examGrade = examGrade;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public Byte getExamPass() {
        return examPass;
    }

    public void setExamPass(Byte examPass) {
        this.examPass = examPass;
    }

    public String getInterviewRecord() {
        return interviewRecord;
    }

    public void setInterviewRecord(String interviewRecord) {
        this.interviewRecord = interviewRecord == null ? null : interviewRecord.trim();
    }

    public Date getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }

    public Byte getInterviewPass() {
        return interviewPass;
    }

    public void setInterviewPass(Byte interviewPass) {
        this.interviewPass = interviewPass;
    }

    public Byte getHealthy() {
        return healthy;
    }

    public void setHealthy(Byte healthy) {
        this.healthy = healthy;
    }

    public Date getTrainingStart() {
        return trainingStart;
    }

    public void setTrainingStart(Date trainingStart) {
        this.trainingStart = trainingStart;
    }

    public Date getTrainingEnd() {
        return trainingEnd;
    }

    public void setTrainingEnd(Date trainingEnd) {
        this.trainingEnd = trainingEnd;
    }

    public String getTrainingRecord() {
        return trainingRecord;
    }

    public void setTrainingRecord(String trainingRecord) {
        this.trainingRecord = trainingRecord == null ? null : trainingRecord.trim();
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