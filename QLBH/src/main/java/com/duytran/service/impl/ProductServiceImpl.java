package com.duytran.service.impl;

import com.duytran.dao.ProductDao;
import com.duytran.model.Product;
import com.duytran.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
     private ProductDao productDao;

    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    @Override
    public void updateProduct(int id, int number) {
        productDao.updateProduct(id, number);
    }

    @Override
    public void deleteProduct(int id) {
        productDao.deleteProduct(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }

    @Override
    public Product getProductById(int id) {
        return productDao.getProductById(id);
    }
    @Override
    public List<Product> getProductByProvider(int id) {
        return productDao.getProductByProvider(id);
    }

    @Override
    public void updateProductByObject(Product product) {
        productDao.updateProductByObject(product);
    }

    @Override
    public Product getProductByQR_code(int QR_code) {
        return productDao.getProductByQR_code(QR_code);
    }
}
