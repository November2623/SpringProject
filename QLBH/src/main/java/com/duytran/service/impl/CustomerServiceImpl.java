package com.duytran.service.impl;

import com.duytran.dao.CustomerDao;
import com.duytran.model.Customer;
import com.duytran.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerDao.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customerDao.deleteCustomer(id);
    }

    @Override
    public Customer getUserById(int id) {
        return customerDao.getUserById(id);
    }

    @Override
    public List<Customer> getAllUsers() {
        return customerDao.getAllUsers();
    }
}