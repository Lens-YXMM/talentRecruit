package com.recruit.data.pojo;

import java.util.Date;

/**
 * @table resume_award 简历所获奖项表
 */
public class ResumeAward {
    private Integer id;         // 主键id

    private Integer resumeId;   // 简历表主键

    private String name;        // 奖项名称

    private Byte type;          // 奖项类型：1-竞赛获奖，2-奖学金

    private Byte awardLevel;    // 奖项级别：1-国际级，2-国家级，3-省市级，4-院级

    private String prizeLevel;  // 奖项等级，如：一等奖，特等奖等

    private Date awardDate;     // 获奖日期，以此字段倒序排序

    private String remark;      // 奖项详细信息（备注）

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