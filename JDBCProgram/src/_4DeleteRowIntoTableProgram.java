import java.util.Scanner;
import java.sql.*;
public class _4DeleteRowIntoTableProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // Loading the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loaded...");

            // establishing Connecting
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/janbatch?user=root&password=system");
            System.out.println("Connected to database...");

            String query = "Delete from batches where id = ?";
            pstmt = conn.prepareStatement(query);

            System.out.println("Enter the id to be deleted: ");
            int id = sc.nextInt();
            pstmt.setInt(1, id);

            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " rows deleted");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            sc.close();
            try{
                conn.close();
                pstmt.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
