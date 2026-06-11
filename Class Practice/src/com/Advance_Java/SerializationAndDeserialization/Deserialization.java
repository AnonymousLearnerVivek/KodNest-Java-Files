package com.Advance_Java.SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path1 = "C:\\janbatch\\Serialization\\Student.txt";
        FileInputStream fis = new FileInputStream(path1);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student std = (Student) ois.readObject();
        System.out.println(std);


        String path2 = "C:\\janbatch\\Serialization\\Employee.txt";
        FileInputStream fis2 = new FileInputStream(path2);
        ObjectInputStream ois2 = new ObjectInputStream(fis2);

        Employee emp = (Employee) ois2.readObject();
        System.out.println(emp);

        ois.close();
        fis.close();
        fis2.close();
        ois2.close();
    }
}
