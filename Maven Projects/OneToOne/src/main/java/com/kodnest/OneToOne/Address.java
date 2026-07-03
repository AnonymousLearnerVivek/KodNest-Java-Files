package com.kodnest.OneToOne;

import jakarta.persistence.*;

import javax.xml.namespace.QName;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int addr_id;

    @Column
    String streat;

    @Column
    String area;

    public Address() {

    }
    public Address(String streat, String area) {
        this.streat = streat;
        this.area = area;
    }
    public int getAddr_id() {
        return addr_id;
    }
    public void setAddr_id(int addr_id) {
        this.addr_id = addr_id;
    }
    public String getStreat() {
        return streat;
    }
    public void setStreat(String streat) {
        this.streat = streat;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

}
