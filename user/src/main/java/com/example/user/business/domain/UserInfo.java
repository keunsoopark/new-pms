package com.example.user.business.domain;

import java.util.Date;
import java.util.UUID;

public class UserInfo {
    //    private UUID userId;
    private long userId;

    private String userName;

    private String userAccountId;

    private String userPermission;

    private Date createdDateTime;

//    public UUID getUserId() {
//        return userId;
//    }
//
//    public void setUserId(UUID userId) {
//        this.userId = userId;
//    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(String userAccountId) {
        this.userAccountId = userAccountId;
    }

    public String getUserPermission() {
        return userPermission;
    }

    public void setUserPermission(String userPermission) {
        this.userPermission = userPermission;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }
}
