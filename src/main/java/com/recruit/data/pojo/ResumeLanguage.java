package com.recruit.data.pojo;

import java.util.Date;

public class ResumeLanguage {
    private Integer id;

    private Integer resumeId;

    private String name;

    private Byte oralLevel;

    private Byte writeLevel;

    private Byte readLevel;

    private String testName;

    private Integer testGrade;

    private Date createTime;

    private Date updateTime;

    public ResumeLanguage(Integer id, Integer resumeId, String name, Byte oralLevel, Byte writeLevel, Byte readLevel, String testName, Integer testGrade, Date createTime, Date updateTime) {
        this.id = id;
        this.resumeId = resumeId;
        this.name = name;
        this.oralLevel = oralLevel;
        this.writeLevel = writeLevel;
        this.readLevel = readLevel;
        this.testName = testName;
        this.testGrade = testGrade;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public ResumeLanguage() {
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

    public Byte getOralLevel() {
        return oralLevel;
    }

    public void setOralLevel(Byte oralLevel) {
        this.oralLevel = oralLevel;
    }

    public Byte getWriteLevel() {
        return writeLevel;
    }

    public void setWriteLevel(Byte writeLevel) {
        this.writeLevel = writeLevel;
    }

    public Byte getReadLevel() {
        return readLevel;
    }

    public void setReadLevel(Byte readLevel) {
        this.readLevel = readLevel;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName == null ? null : testName.trim();
    }

    public Integer getTestGrade() {
        return testGrade;
    }

    public void setTestGrade(Integer testGrade) {
        this.testGrade = testGrade;
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