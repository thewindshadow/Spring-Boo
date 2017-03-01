package com.battle.service.impl;

import com.battle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by Bing.Z on 2017/2/28.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void create(String name, Integer age) {
        jdbcTemplate.update("INSERT INTO USER(NAME,AGE) VALUES(?,?)",name,age);
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("DELETE FROM USER WHERE NAME = ? ", name);
    }

    @Override
    public Integer getAllUser() {
        return jdbcTemplate.queryForObject("SELECT COUNT(1) FROM USER",Integer.class);
    }

    @Override
    public void deleteAllUser() {
        jdbcTemplate.update("DELETE FROM USER");
    }

    @Override
    public void update(String name, Integer age) {
        jdbcTemplate.update("UPDATE USER SET age = ? WHERE  NAME = ?",age,name);
    }
}
