package com.duytran.entity;
import com.duytran.model.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.*;


@Entity
@Table(name = "provider")
public class Provider implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "provider_name")
    private String provider_name;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name ="more_info")
    private String more_info;

    @Column(name = "contract_date")
    private Date contract_date;

    public Provider() {
    }

    public Provider(String provider_name, String address, String phone, String email, String more_info, Date contract_date) {
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