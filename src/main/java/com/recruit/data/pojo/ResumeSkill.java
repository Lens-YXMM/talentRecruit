package com.recruit.data.pojo;

import java.util.Date;

/**
 * @table resume_skill 简历技能表
 */
public class ResumeSkill {
    private Integer id;         // 主键id

    private Integer resumeId;   // 简历表主键

    private String name;        // 技能名称

    private Byte level;         // 技能等级：1-一般，2-熟练，3-精通

    private Date createTime;

    private Date updateTime;

    public ResumeSkill(Integer id, Integer resumeId, String name, Byte level, Date createTime, Date updateTime) {
        this.id = id;
        this.resumeId = resumeId;
        this.name = name;
        this.level = level;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public ResumeSkill() {
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

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
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