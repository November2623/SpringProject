package com.duytran.service;

import com.duytran.model.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);

    public void updateUser(User User);

    public void deleteUser(int id);

    public User getUserById(int id);

    public List<User> getAllUsers();
}
