package com.pms.common.mngproject.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectMainDao {
    private final String projectCode;
    private final String projectName;
    private final String projectStartDate;
    private final String projectEndDate;
    private final String projectTypeCode;
    private final String projectStatusCode;
    private final String projectCreateUser;
    private final String projectRespUser;
    private final Date projectTimestamp;

    public ProjectMainDao(String projectCode,
                          String projectName,
                          String projectStartDate,
                          String projectEndDate,
                          String projectTypeCode,
                          String projectStatusCode,
                          String projectCreateUser,
                          String projectRespUser,
                          Date projectTimestamp) {
        this.projectCode = projectCode;
        this.projectName = projectName;
        this.projectStartDate = projectStartDate;
        this.projectEndDate = projectEndDate;
        this.projectTypeCode = projectTypeCode;
        this.projectStatusCode = projectStatusCode;
        this.projectCreateUser = projectCreateUser;
        this.projectRespUser = projectRespUser;
        this.projectTimestamp = projectTimestamp;
    }

    public String projectCode() {
        return projectCode;
    }
    public String projectName() {
        return projectName;
    }
    public String projectStartDate() {
        return projectStartDate;
    }
    public String projectEndDate() {
        return projectEndDate;
    }
    public String projectTypeCode() {
        return projectTypeCode;
    }
    public String projectStatusCode() {
        return projectStatusCode;
    }
    public String projectCreateUser() {
        return projectCreateUser;
    }
    public String projectRespUser() {
        return projectRespUser;
    }
    public Date projectTimestamp() {
        return projectTimestamp;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("projectCode=").append(projectCode);
        sb.append("projectName=").append(projectName);
        sb.append("projectStartDate=").append(projectStartDate);
        sb.append("projectEndDate=").append(projectEndDate);
        sb.append("projectTypeCode=").append(projectTypeCode);
        sb.append("projectStatusCode=").append(projectStatusCode);
        sb.append("projectCreateUser=").append(projectCreateUser);
        sb.append("projectRespUser=").append(projectRespUser);
        sb.append("projectTimestamp=").append(projectTimestamp);

        return sb.toString();
    }


}
