package recruit.data.entity;

import java.util.Date;

public class User {
    private int uiId;
    private String uiAccount;
    private String uiPassword;
    private String uiName;
    private int uiGender;
    private String uiPhoneNum;
    private String uiMailAddr;
    private Date uiCreatedTime;
    private int uiWeight;
    private int uiIsdeleted;
    private int uiIsblacked;

    public int getUiId() {
        return uiId;
    }

    public void setUiId(int uiId) {
        this.uiId = uiId;
    }

    public String getUiAccount() {
        return uiAccount;
    }

    public void setUiAccount(String uiAccount) {
        this.uiAccount = uiAccount;
    }

    public String getUiPassword() {
        return uiPassword;
    }

    public void setUiPassword(String uiPassword) {
        this.uiPassword = uiPassword;
    }

    public String getUiName() {
        return uiName;
    }

    public void setUiName(String uiName) {
        this.uiName = uiName;
    }

    public int getUiGender() {
        return uiGender;
    }

    public void setUiGender(int uiGender) {
        this.uiGender = uiGender;
    }

    public String getUiPhoneNum() {
        return uiPhoneNum;
    }

    public void setUiPhoneNum(String uiPhoneNum) {
        this.uiPhoneNum = uiPhoneNum;
    }

    public String getUiMailAddr() {
        return uiMailAddr;
    }

    public void setUiMailAddr(String uiMailAddr) {
        this.uiMailAddr = uiMailAddr;
    }

    public Date getUiCreatedTime() {
        return uiCreatedTime;
    }

    public void setUiCreatedTime(Date uiCreatedTime) {
        this.uiCreatedTime = uiCreatedTime;
    }

    public int getUiWeight() {
        return uiWeight;
    }

    public void setUiWeight(int uiWeight) {
        this.uiWeight = uiWeight;
    }

    public int getUiIsdeleted() {
        return uiIsdeleted;
    }

    public void setUiIsdeleted(int uiIsdeleted) {
        this.uiIsdeleted = uiIsdeleted;
    }

    public int getUiIsblacked() {
        return uiIsblacked;
    }

    public void setUiIsblacked(int uiIsblacked) {
        this.uiIsblacked = uiIsblacked;
    }
}
