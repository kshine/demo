package com.freedom.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * Created by kshine on 2017/5/1.
 */
public class UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void updateUser(User user){
        String sql = "update t_user set username=?,password=? where id= ?";
        Object[] args ={user.getUsername(),user.getPassword(),user.getId()};
        jdbcTemplate.update(sql,args);
    }

    public User findUser(int id){
        String sql = "SELECT * from t_user where id = ?";
      //  Object[] args ={id};
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
        return jdbcTemplate.queryForObject(sql,rowMapper,id);
    }
}
