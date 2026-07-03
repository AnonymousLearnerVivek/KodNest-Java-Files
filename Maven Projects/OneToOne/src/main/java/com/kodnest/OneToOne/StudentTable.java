package com.kodnest.OneToOne;

import jakarta.persistence.*;

@Entity
@Table(name = "studenttable")
public class StudentTable {
    @Id
    int id;

    @Column
    String name;

    @Column
    String emailid;

    @Column
    int phone;

    @OneToOne(cascade = CascadeType.ALL) // for syncing
    @JoinColumn(name = "addr_id", referencedColumnName = "addr_id")
    Address address;

    public StudentTable(int id, String name, String emailid, int phone, Address address) {
        this.id = id;
        this.name = name;
        this.emailid = emailid;
        this.phone = phone;
        this.address = address;
    }
}
