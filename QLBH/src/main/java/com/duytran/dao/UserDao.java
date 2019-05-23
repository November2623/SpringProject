package com.duytran.dao;
import com.duytran.model.User;
import java.util.List;

public interface UserDao {
    public void addUser(User user);

    public void updateUser(User User);

    public void deleteUser(int id);

    public User getUserById(int id);

    public List<User> getAllUsers();
}
