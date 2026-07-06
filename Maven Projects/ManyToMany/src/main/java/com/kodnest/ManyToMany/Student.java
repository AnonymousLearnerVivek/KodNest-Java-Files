package com.kodnest.ManyToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String name;

    @ManyToMany
    @JoinTable(name = "student_course_details", joinColumns = @JoinColumn(name = "sid"),
                inverseJoinColumns = @JoinColumn(name = "cid"))
    List<Course> courses;

    public Student() {
    }
    public Student(String name) {
        this.name = name;
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
    public List<Course> getCourses() {
        return courses;
    }
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

}
