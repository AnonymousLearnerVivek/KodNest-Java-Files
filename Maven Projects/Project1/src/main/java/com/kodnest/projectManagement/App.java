package com.kodnest.projectManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/janbatch";
        String username = "root";
        String password = "system";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String  query = "select * from batches";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,username,password);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int count = rs.getInt("count");
                System.out.println(id + " " + name + " " + count);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
