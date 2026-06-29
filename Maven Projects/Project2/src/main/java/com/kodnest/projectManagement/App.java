package com.kodnest.projectManagement;

import java.sql.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/janbatch";
        String username = "root";
        String password = "system";
        Connection conn = null;
        String sql = "Select * from studentresult where sid = ?";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);

            pstmt = conn.prepareStatement(sql);
            System.out.println("Enter the ID");
            int id = sc.nextInt();
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int m1 = rs.getInt(3);
                int m2 = rs.getInt(4);
                int m3 = rs.getInt(5);
                int m4 = rs.getInt(6);
                int total = m1 + m2 + m3 + m4;
                float avg = (float)total/400;
                float percentage = avg * 100;
                System.out.println(rs.getInt(1) + " " + rs.getString(2) +  " " + m1 +  " "
                        + m2 +  " " + m3 +  " " + m4 + " Percentage is " + percentage + "%");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                sc.close();
                conn.close();
                pstmt.close();
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Connection is closed");
        }
    }
}
