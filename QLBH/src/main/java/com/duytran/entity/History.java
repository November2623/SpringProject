package com.duytran.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name="history")
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="status")
    private String status;

    @Column(name="product_QR_code")
    private int product_QR_code;

    @Column(name="amount")
    private int amount;

    @Column(name="price")
    private int price;

    @Column(name="date")
    private LocalDateTime localDateTime;

    public History() {
    }

    public History(String status, int product_QR_code, int amount, int price, LocalDateTime date) {
        this.status = status;
        this.product_QR_code = product_QR_code;
        this.amount = amount;
        this.price = price;
        this.localDateTime = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getProduct_QR_code() {
        return product_QR_code;
    }

    public void setProduct_QR_code(int product_QR_code) {
        this.product_QR_code = product_QR_code;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDateTime getDate() {
        return localDateTime;
    }

    public void setDate(LocalDateTime date) {
        this.localDateTime = date;
    }
}