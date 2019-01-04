package com.recruit.data.pojo;

import java.util.Date;

public class ResumeAward {
    private Integer id;

    private Integer resumeId;

    private String name;

    private Byte type;

    private Byte awardLevel;

    private String prizeLevel;

    private Date awardDate;

    private String remark;

    private Date createTime;

    private Date updateTime;

    public ResumeAward(Integer id, Integer resumeId, String name, Byte type, Byte awardLevel, String prizeLevel, Date awardDate, String remark, Date createTime, Date updateTime) {
        this.id = id;
        this.resumeId = resumeId;
        this.name = name;
        this.type = type;
        this.awardLevel = awardLevel;
        this.prizeLevel = prizeLevel;
        this.awardDate = awardDate;
        this.remark = remark;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public ResumeAward() {
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

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getAwardLevel() {
        return awardLevel;
    }

    public void setAwardLevel(Byte awardLevel) {
        this.awardLevel = awardLevel;
    }

    public String getPrizeLevel() {
        return prizeLevel;
    }

    public void setPrizeLevel(String prizeLevel) {
        this.prizeLevel = prizeLevel == null ? null : prizeLevel.trim();
    }

    public Date getAwardDate() {
        return awardDate;
    }

    public void setAwardDate(Date awardDate) {
        this.awardDate = awardDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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