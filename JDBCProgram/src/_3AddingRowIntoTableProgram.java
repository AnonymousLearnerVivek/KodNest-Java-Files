import java.sql.*;
import java.util.Scanner;

public class _3AddingRowIntoTableProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            // Loading the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loaded");
            // Establishing the connection
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/janbatch", "root", "system");
            // other way
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/janbatch?user=root&password=system");
            System.out.println("Connected to database successfully");

            // Query
            String sql = "insert into batches values(?,?,?)";

            // creating a prepared statement medium
            pstmt = conn.prepareStatement(sql);

            System.out.println("Enter the batch id, name, count");
            int id = sc.nextInt();
            String name = sc.next();
            int count = sc.nextInt();

            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setInt(3, count);

            // Adding the rows
            int rowsAffected = pstmt.executeUpdate(); // .executeUpdate() method return type is int and return 0 and 1 because it will show how many rows got inserted
            System.out.println(rowsAffected + " rows inserted");

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            sc.close();
            try {
                conn.close();
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}






























