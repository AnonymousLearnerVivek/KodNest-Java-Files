package com.kodnest.PracticeProject;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "customers")
public class Customers {
    @Id
    int id;

    @Column
    String name;

    @Column
    String address;

    @Column
    int phone;

    @Column
    String email;

    @ManyToMany
    @JoinTable(name = "customer_product_details",
               joinColumns = @JoinColumn(name = "cid"),
               inverseJoinColumns = @JoinColumn(name = "pid") )
    List<Products> products;

    public Customers() {

    }
    public Customers(int id, String name, String address, int phone, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<Products> getProducts() {
        return products;
    }
    public void setProducts(List<Products> products) {
        this.products = products;
    }
}
