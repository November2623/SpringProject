package com.duytran.model;

public class User {
    private int id;
    private String user_name;
    private String password;

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    @Override
    public String toString() {
        return id + user_name + password;
    }
}
