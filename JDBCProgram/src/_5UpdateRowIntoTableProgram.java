import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class _5UpdateRowIntoTableProgram {
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

            String query = "Update batches set count = ? where id = ?";
            pstmt = conn.prepareStatement(query);

            System.out.println("Enter the id and newCount to be updated with the newCount: ");
            int id = sc.nextInt();
            int newCount = sc.nextInt();
            pstmt.setInt(2, id);
            pstmt.setInt(1, newCount);

            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " rows updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
