package com.cg.demoRestful.model;


import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String email;
    private String tel;
    private String address;

    public Customer(String name, String email, String tel, String address) {
        this.name = name;
        this.email = email;
        this.tel = tel;
        this.address = address;
    }

    public Customer(long id,String name, String email, String tel, String address) {
        this.id= id;
        this.name = name;
        this.email = email;
        this.tel = tel;
        this.address = address;
    }

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
