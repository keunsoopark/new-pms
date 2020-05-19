package com.pms.common.user.data.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="USER")
public class User {
    @Id
    @Column(name="UserId", columnDefinition="VARCHAR(255")
    @GeneratedValue(generator="uuid2")
    @GenericGenerator(name="uuid2", strategy="org.hibernate.id.UUIDGenerator")
    private UUID userId;

    @Column(name="UserName")
    private String userName;

    @Column(name="UserAccountId")
    private String userAccountId;

    @Column(name="UserPassword")
    private String userPassword;

    @Column(name="UserPermission")
    private String userPermission;

    @Column(name="CreatedDateTime")
    private Date createdDateTime;

    @Column(name="UpdatedDateTime")
    private Date updatedDateTime;

    @Column(name="DeletedDateTime")
    private Date deletedDateTime;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
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

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
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

    public Date getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(Date updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public Date getDeletedDateTime() {
        return deletedDateTime;
    }

    public void setDeletedDateTime(Date deletedDateTime) {
        this.deletedDateTime = deletedDateTime;
    }
}
