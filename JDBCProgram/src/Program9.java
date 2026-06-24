import java.sql.*;
import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loaded");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/janbatch?user=root&password=system");
            System.out.println("Connected to database successfully");

            System.out.println("Press 1 to Update Your Name");
            System.out.println("Press 2 to Update Your Salary");
            int press = sc.nextInt();
            if (press == 1) {
                System.out.println("You have pressed 1");
                String query1 = "Update emp set name = ? where id = ?";
                pstmt1 = conn.prepareStatement(query1);
                System.out.println("Enter the id and newName to be updated");
                int id = sc.nextInt();
                String newName = sc.next();
                pstmt1.setInt(2, id);
                pstmt1.setString(1, newName);

                int rows = pstmt1.executeUpdate();

                System.out.println("Rows affected: " + rows);
                System.out.println("Your name has been updated successfully");
            }
            else if (press == 2) {
                System.out.println("You have pressed 2");
                String query2 = "Update emp set salary = ? where id = ?";
                pstmt2 = conn.prepareStatement(query2);
                System.out.println("Enter the id and newSalary to be updated");
                int id = sc.nextInt();
                int newSalary = sc.nextInt();
                pstmt2.setInt(2, id);
                pstmt2.setInt(1, newSalary);

                int rows = pstmt2.executeUpdate();
                System.out.println("Rows affected: " + rows);
                System.out.println("Your salary has been updated successfully");
            } else{
                System.out.println("Invalid input");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                sc.close();
                conn.close();
                if(pstmt1 != null) pstmt1.close();
                if(pstmt2    != null) pstmt2.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            System.out.println("Connection closed");
        }
    }
}
