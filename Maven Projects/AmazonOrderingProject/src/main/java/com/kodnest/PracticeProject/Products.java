package com.kodnest.PracticeProject;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "products")
public class Products {
    @Id
    int id;

    @Column
    String name;

    @Column
    int price;

    @ManyToMany(mappedBy = "products", cascade = CascadeType.ALL)
    List<Customers> customers;
    public Products() {

    }
    public Products(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
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
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public List<Customers> getCustomers() {
        return customers;
    }
    public void setCustomers(List<Customers> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Product id: " + id + ", name: " + name + ", price: " + price;
    }
}
