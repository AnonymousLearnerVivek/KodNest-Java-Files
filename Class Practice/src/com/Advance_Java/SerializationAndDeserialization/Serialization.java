package com.Advance_Java.SerializationAndDeserialization;

import java.io.*;

public class Serialization {
    public static void main(String[] args) throws IOException {
        Student student = new Student(101, "Vivek", 22, 97);
        System.out.println(student);

        String path1 = "C:\\janbatch\\Serialization\\Student.txt";
        FileOutputStream fos = new FileOutputStream(path1);
        ObjectOutputStream obj = new ObjectOutputStream(fos);

        obj.writeObject(student);
        System.out.println("Student object has been saved to Student.txt");

        Employee emp = new Employee(11569, "Dolby", 34);
        String path2 = "C:\\janbatch\\Serialization\\Employee.txt";
        FileOutputStream fos2 = new FileOutputStream(path2);
        ObjectOutputStream obj2 = new ObjectOutputStream(fos2);


        obj2.writeObject(emp);
        System.out.println("Employee object has been saved to Employee.txt");

        fos.close();
        obj.close();
    }
}
