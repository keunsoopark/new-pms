package com.example.user.data.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="USER")
public class User {

    //    @Id
//    @Column(name="UserId", columnDefinition="VARCHAR(255)")
//    @GeneratedValue(generator="uuid2")
//    @GenericGenerator(name="uuid2", strategy="org.hibernate.id.UUIDGenerator")
//    private UUID userId;
    @Id
    @Column(name = "USER_ID")
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "NAME", nullable = false)
    private String userName;

    @Column(name = "ACCOUNT_ID", nullable = false)
    private String userAccountId;

    @Column(name = "PASSWORD", nullable = false)
    private String userPassword;

    @Column(name = "PERMISSION", nullable = false)
    private String userPermission;

    @Column(name = "CREATE_DATETIME", nullable = false)
    private Date createdDateTime;

    @Column(name = "UPDATE_DATETIME")
    private Date updatedDateTime;

    @Column(name = "DELETED_DATETIME")
    private Date deletedDateTime;

//    public UUID getUserId() {
//        return userId;
//    }
//
//    public void setUserId(UUID userId) {
//        this.userId = userId;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
