package com.kodnest.UpdateObject;

import jakarta.persistence.*;

@Entity
@Table(name="course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String name;

    @Column
    String duration;

    @Column
    int fees;

    @Column
    int studentCount;

    public Course() {

    }

    public Course(int id, String name, String duration, int fees, int studentCount) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.fees = fees;
        this.studentCount = studentCount;
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
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public int getFees() {
        return fees;
    }
    public void setFees(int fees) {
        this.fees = fees;
    }
    public int getStudentCount() {
        return studentCount;
    }
    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

}
