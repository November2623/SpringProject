package com.duytran.model;

public class Product {
    private int id;
    private String product_name;
    private int QR_code;
    private int id_provider;
    private int amount;
    private String unit;
    private int price_receipt;
    private int price_issue;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getQR_code() {
        return QR_code;
    }

    public void setQR_code(int QR_code) {
        this.QR_code = QR_code;
    }

    public int getId_provider() {
        return id_provider;
    }

    public void setId_provider(int id_provider) {
        this.id_provider = id_provider;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getPrice_receipt() {
        return price_receipt;
    }

    public void setPrice_receipt(int price_receipt) {
        this.price_receipt = price_receipt;
    }

    public int getPrice_issue() {
        return price_issue;
    }

    public void setPrice_issue(int price_issue) {
        this.price_issue = price_issue;
    }
}
