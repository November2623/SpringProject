package com.duytran.model;
import java.util.Date;


public class ProviderDTO {
    private int id;
    private String provider_name;
    private String address;
    private String phone;
    private String email;
    private String more_info;
    private Date contract_date;


    public ProviderDTO() {
    }

    public ProviderDTO(int id, String provider_name, String address, String phone, String email, String more_info, Date contract_date) {
        this.id = id;
        this.provider_name = provider_name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.more_info = more_info;
        this.contract_date = contract_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvider_name() {
        return provider_name;
    }

    public void setProvider_name(String provider_name) {
        this.provider_name = provider_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMore_info() {
        return more_info;
    }

    public void setMore_info(String more_info) {
        this.more_info = more_info;
    }

    public Date getContract_date() {
        return contract_date;
    }

    public void setContract_date(Date contract_date) {
        this.contract_date = contract_date;
    }
}
