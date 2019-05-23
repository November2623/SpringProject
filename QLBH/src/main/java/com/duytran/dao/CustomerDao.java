package com.duytran.dao;

import com.duytran.model.Customer;

import java.util.List;

public interface CustomerDao {
    public void addCustomer(Customer customer);

    public void updateCustomer(Customer customer);

    public void deleteCustomer(int id);

    public Customer getUserById(int id);

    public List<Customer> getAllUsers();
}
