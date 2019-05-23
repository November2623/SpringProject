package com.duytran.dao.impl;

import com.duytran.dao.UserDao;
import com.duytran.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addUser(User user) {
        String sql = "insert into user(user_name, password) value(?,?)";
        jdbcTemplate.update(sql, user.getUser_name(), user.getPassword());
    }

    @Override
    public void updateUser(User user) {
        String sql = "update user set id = ? and set user_name = ? and set password = ? where id = ?";
        jdbcTemplate.update(sql, user.getId(), user.getUser_name(), user.getPassword(), user.getId());
    }

    @Override
    public void deleteUser(int id) {
        String sql = "delete from user where id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public User getUserById(int id) {
        String sql = "select * from user where id = ?";
         return jdbcTemplate.queryForObject(sql, new Object[]{id}, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUser_name((resultSet.getString("user_name")));
                user.setPassword(resultSet.getString("password"));
                return user;
            }
        });
    }

    @Override
    public List<User> getAllUsers() {
        String sql = "select * from user";
        return jdbcTemplate.query(sql, new Object[]{ }, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUser_name((resultSet.getString("user_name")));
                user.setPassword(resultSet.getString("password"));
                return user;
            }
        });
    }

}