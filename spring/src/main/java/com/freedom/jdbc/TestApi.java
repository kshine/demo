package com.freedom.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

/**
 * Created by kshine on 2017/5/1.
 */
public class TestApi {
    public static void main(String[] args) {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/spring");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(druidDataSource);

        List<Map<String, Object>> userList = jdbcTemplate.queryForList("select * from t_user");
        System.out.println(userList);
    }
}
