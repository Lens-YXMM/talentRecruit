package com.recruit.data.pojo;

import java.util.Date;

/**
 * @table sys_resume 简历基本信息表
 */
public class Resume {
    private Integer id;                 // 主键id

    private Integer userId;             // 用户表主键

    private Integer nativeProvince;     // 籍贯（省）

    private Integer nativeDistrict;     // 籍贯（区（县级市，县，区））

    private Boolean maritalStatus;      // 婚姻状态默认0-未婚，1-已婚，2-离异

    private Boolean educationLevel;     // 最高学历1-博士，2-硕士，3-本科，4-大专，5-高中，6-其他

    private String school;              // 目前所在学校或者毕业学校

    private Integer currentLocation;    // 当前所在城市

    private String personalState;       // 自我描述

    private String preview;             // 简历预览，存放简历信息的HTML富文本

    private Byte defaultPost;           // 默认简历投递方式，1-在线简历，2-附件简历

    private String attachment;          // 附件存储地址

    private Date createTime;

    private Date updateTime;

    public Resume(Integer id, Integer userId, Integer nativeProvince, Integer nativeDistrict, Boolean maritalStatus, Boolean educationLevel, String school, Integer currentLocation, String personalState, String preview, Byte defaultPost, String attachment, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.nativeProvince = nativeProvince;
        this.nativeDistrict = nativeDistrict;
        this.maritalStatus = maritalStatus;
        this.educationLevel = educationLevel;
        this.school = school;
        this.currentLocation = currentLocation;
        this.personalState = personalState;
        this.preview = preview;
        this.defaultPost = defaultPost;
        this.attachment = attachment;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Resume() {
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

    public Integer getNativeProvince() {
        return nativeProvince;
    }

    public void setNativeProvince(Integer nativeProvince) {
        this.nativeProvince = nativeProvince;
    }

    public Integer getNativeDistrict() {
        return nativeDistrict;
    }

    public void setNativeDistrict(Integer nativeDistrict) {
        this.nativeDistrict = nativeDistrict;
    }

    public Boolean getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Boolean getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(Boolean educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public Integer getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Integer currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getPersonalState() {
        return personalState;
    }

    public void setPersonalState(String personalState) {
        this.personalState = personalState == null ? null : personalState.trim();
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview == null ? null : preview.trim();
    }

    public Byte getDefaultPost() {
        return defaultPost;
    }

    public void setDefaultPost(Byte defaultPost) {
        this.defaultPost = defaultPost;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment == null ? null : attachment.trim();
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