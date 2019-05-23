package com.duytran.dao;

import com.duytran.model.Product;

import java.util.List;


public interface ProductDao {
    public void addProduct(Product product);
    public void updateProduct(int id, int number);
    public void deleteProduct(int id);
    public List<Product> getAllProducts();
    public Product getProductById(int id);
}
