package com.kodnest.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/janbatch";
        String username = "root";
        String password = "system";
        Connection conn = null;
        String sql = "insert into studentresult values(?,?,?,?,?,?)";
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loaded");

            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database successfully");

            pstmt = conn.prepareStatement(sql);
            System.out.println("Enter the number of rows");
            int rows = sc.nextInt();

            while(rows > 0) {
                System.out.println("Enter the student ID, name, marks1, marks2, marks3, marks4");
                int id = sc.nextInt();
                String name = sc.next();
                int m1 =  sc.nextInt();
                int m2 =  sc.nextInt();
                int m3 =  sc.nextInt();
                int m4 =  sc.nextInt();
                pstmt.setInt(1, id);
                pstmt.setString(2, name);
                pstmt.setInt(3, m1);
                pstmt.setInt(4, m2);
                pstmt.setInt(5, m3);
                pstmt.setInt(6, m4);
                pstmt.addBatch();
                rows--;
            }
            int[] rs = pstmt.executeBatch(); // return type is int[] array

            for(int i = 0; i < rs.length; i++) {
                System.out.print(rs[i] + " ");
            }
            System.out.println("Rows inserted");
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                sc.close();
                conn.close();
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Connection closed");
        }
    }
}
