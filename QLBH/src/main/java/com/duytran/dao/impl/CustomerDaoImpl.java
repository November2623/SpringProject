package com.duytran.dao.impl;

import com.duytran.dao.CustomerDao;
import com.duytran.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;

@Repository
public class CustomerDaoImpl implements CustomerDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addCustomer(Customer customer) {
        String sql ="insert into customer(customer_name, address, phone, email, more_info, contract_date) value(?,?,?,?,?,?)";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String currentDate = formatter.format(date);
        Date current = null;
        try {
            current = formatter.parse(currentDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        jdbcTemplate.update(sql, customer.getCustomer_name(), customer.getAddress(), customer.getPhone(),
                    customer.getEmail(), customer.getMore_info(), current);

    }

    @Override
    public void updateCustomer(Customer customer) {
        String sql ="update customer set customer_name = ?,address = ?,phone= ?,email= ?,more_info = ? where id = ?";

        jdbcTemplate.update(sql, customer.getCustomer_name(), customer.getAddress(), customer.getPhone(),
                customer.getEmail(), customer.getMore_info(), customer.getId());
    }

    @Override
    public void deleteCustomer(int id) {
        String sql = "delete from customer where id =?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public Customer getUserById(int id) {
        String sql = "select * from customer where id =?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new RowMapper<Customer>() {
            @Override
            public Customer mapRow(ResultSet rs, int i) throws SQLException {
                Customer customer = new Customer();
                customer.setId(rs.getInt("id"));
                customer.setCustomer_name(rs.getString("customer_name"));
                customer.setAddress(rs.getString("address"));
                customer.setPhone(rs.getString("phone"));
                customer.setEmail(rs.getString("email"));
                customer.setMore_info(rs.getString("more_info"));
                return customer;
            }
        });
    }

    @Override
    public List<Customer> getAllUsers() {

        String sql = "select * from customer";
        return jdbcTemplate.query(sql, new Object[]{ }, new RowMapper<Customer>() {
            @Override
            public Customer mapRow(ResultSet rs, int i) throws SQLException {
                Customer customer = new Customer();
                customer.setId(rs.getInt("id"));
                customer.setCustomer_name(rs.getString("customer_name"));
                customer.setAddress(rs.getString("address"));
                customer.setPhone(rs.getString("phone"));
                customer.setEmail(rs.getString("email"));
                customer.setMore_info(rs.getString("more_info"));
                customer.setContract_date(rs.getDate("contract_date"));
                return customer;
            }
        });
    }
}