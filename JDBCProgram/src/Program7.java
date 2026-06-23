import java.util.Scanner;
import java.sql.*;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loaded");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/janbatch?user=root&password=system");


            String updateQuery1  = "update bank set balance = balance - ? where accNo = ?";
            String updateQuery2  = "update bank set balance = balance + ? where accNo = ?";
            pstmt1 = conn.prepareStatement(updateQuery1);
            pstmt2 = conn.prepareStatement(updateQuery2);

            System.out.println("Enter the From accNo, To accNo, amount to be transferred");
            int fromAccNo = sc.nextInt();
            int toAccNo = sc.nextInt();
            int amount = sc.nextInt();

            pstmt1.setInt(2, fromAccNo);
            pstmt1.setInt(1, amount);

            pstmt2.setInt(2, toAccNo);
            pstmt2.setInt(1, amount);

            try {
                conn.setAutoCommit(false);
                int rowsAffected1 = pstmt1.executeUpdate();
                int rowsAffected2 = pstmt2.executeUpdate();
                if(rowsAffected1 == 1 && rowsAffected2 == 1){
                    conn.commit();
                    System.out.println(rowsAffected1 + " " + rowsAffected2 + " " + " rows affected");
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Some error occured. if amount is deducted it will be refunded");
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                sc.close();
                conn.close();
                pstmt1.close();
                pstmt2.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            System.out.println("Connection closed");
        }
    }
}
