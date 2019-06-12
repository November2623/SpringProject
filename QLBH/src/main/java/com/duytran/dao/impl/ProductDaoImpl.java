package com.duytran.dao.impl;

import com.duytran.dao.ProductDao;
import com.duytran.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void addProduct(Product product) {
        String sql = "insert into product(product_name, QR_code, id_provider, amount) value(?,?,?,?)";
        jdbcTemplate.update(sql, product.getProduct_name(), product.getQR_code(), product.getId_provider(),
                product.getAmount());

    }

    @Override
    public void updateProduct(int id, int number) {
        String sql = "update product set amount = ? where id = ?";
        int total = getProductById(id).getAmount() + number;
        jdbcTemplate.update(sql, total, id);
    }

    @Override
    public Product getProductById(int id) {
        String sql = "select * from product where id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet rs, int i) throws SQLException {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setProduct_name(rs.getString("product_name"));
                product.setQR_code(rs.getInt("QR_code"));
                product.setId_provider(rs.getInt("id_provider"));
                product.setAmount(rs.getInt("amount"));

                return product;
            }
        });
    }

    @Override
    public Product getProductByQR_code(int QR_code) {
        String sql = "select * from product where QR_code = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{QR_code}, new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet rs, int i) throws SQLException {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setProduct_name(rs.getString("product_name"));
                product.setQR_code(rs.getInt("QR_code"));
                product.setId_provider(rs.getInt("id_provider"));
                product.setAmount(rs.getInt("amount"));

                return product;
            }
        });
    }

    @Override
    public void deleteProduct(int id) {

    }

    @Override
    public List<Product> getAllProducts() {
        String sql = "select * from product";
        return jdbcTemplate.query(sql, new Object[]{ }, new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet rs, int i) throws SQLException {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setProduct_name(rs.getString("product_name"));
                product.setQR_code(rs.getInt("QR_code"));
                product.setId_provider(rs.getInt("id_provider"));
                product.setAmount(rs.getInt("amount"));
                return product;
            }
        });
    }
}
