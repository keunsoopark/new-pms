package com.pms.common.mngproject.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class ProjectMainJdbc {

    @Autowired
    JdbcTemplate jdbcTemplate;

    //select project detail from DB
    public void getProjectInfo(String projectCode) {
        String sql = "select * from tb_project_main where project_id = ?";
        jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(ProjectMainDao.class), projectCode);
    }

    // select project list from db
    public void getProjectList() {

    }

}
