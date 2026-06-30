package com.kodnest.ReadObject;

import jakarta.persistence.*;

@Entity
//@Table(name = "studentTable") // use this to tell that map Student class to StudentDetail table in mysql
public class Student {
    @Id  // it marks id column as Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)      // it will auto-generate the ID
    int id;

//    @Column(name = "StudentName") // like if the column name in mysql is saved as StudentName,
//    it specifies to map with this column if column name are different here and there
    @Column
    String name;

    @Column
    int age;
    @Column
    String emailid;

    @Column
    String gender;

    public Student() {

    }
    public Student(int id, String name, int age, String emailid, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.emailid = emailid;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmailid() {
        return emailid;
    }
    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", age: " + age + ", emailid: " + emailid;
    }
}
