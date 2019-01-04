package com.recruit.data.pojo;

import java.util.Date;

public class Resume {
    private Integer id;

    private Integer userId;

    private Integer nativeProvince;

    private Integer nativeDistrict;

    private Boolean maritalStatus;

    private Boolean educationLevel;

    private String school;

    private Integer currentLocation;

    private String personalState;

    private String preview;

    private Byte defaultPost;

    private String attachment;

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