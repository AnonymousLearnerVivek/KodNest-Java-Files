import java.sql.*;
import java.util.Scanner;
public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection conn = null;
        CallableStatement cstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loaded");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/janbatch?user=root&password=system");
            System.out.println("Connected to database successfully");

            String query = "Call emp_procedure(?, ?)";
            cstmt = conn.prepareCall(query);
            System.out.println("Enter the id and the Percentage Hike of Salary");
            int id = sc.nextInt();
            int percentageHike = sc.nextInt();
            cstmt.setInt(2, id);
            cstmt.setInt(1, percentageHike);

            boolean res =  cstmt.execute();
            if(res == true){
                rs =  cstmt.getResultSet();
                while(rs.next()){
                    System.out.println(rs.getInt(1) + " " + rs.getString(2) +  " " + rs.getInt(3));
                }
            } else {
                int rowsAffected = cstmt.getUpdateCount();
                System.out.println("Rows affected: " + rowsAffected);
                System.out.println("Salary has been successfully updated");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                sc.close();
                conn.close();
                cstmt.close();
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
