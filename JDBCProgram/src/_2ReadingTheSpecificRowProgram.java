import java.sql.*;
import java.util.Scanner;

public class _2ReadingTheSpecificRowProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Loading the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loaded");

            // Establishing the Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localHost:3306/janbatch", "root", "system");
            System.out.println("Connected to database successfully");

            // create a prepared statement medium
            String sql = "select * from batches where id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            System.out.println("Medium is created");

            // Query
            System.out.println("Enter the batch ID");
            int id = sc.nextInt();
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            System.out.println("Query is executed");

            // Display the result
            while(rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            System.out.println("Result is displayed");

            // Closing the connections
            conn.close();
            pstmt.close();
            rs.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
