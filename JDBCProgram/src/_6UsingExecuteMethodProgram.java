import java.util.Scanner;
import java.sql.*;

public class _6UsingExecuteMethodProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loaded");

            conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/janbatch?user=root&password=system");
            System.out.println("Connected to database successfully");

            // Update Query
            String query1 = "Select * from batches";
            String query2 = "Update batches set count = ? where name = ?";

            // create a prepared statement
//            pstmt = conn.prepareStatement(query1);
            pstmt = conn.prepareStatement(query2);
            System.out.println("Enter the batch name and new Count of the batch to be updated");
            String name = sc.next();
            int newCount = sc.nextInt();
            pstmt.setString(2,name);
            pstmt.setInt(1,newCount);

            boolean res = pstmt.execute(); // .execute() return boolean value, true means the Query is DDL query like select and all where we use .executeQuery()
            // false mean the Query is DML query like add, update or delete where we use .executeUpdate()
            if(res == true){
                rs = pstmt.getResultSet();
                while(rs.next()){
                    System.out.println(rs.getString(1) + " " + rs.getString(2) +  " " + rs.getInt(3));
                }
            } else {
                int rowsAffected = pstmt.getUpdateCount();
                System.out.println("Rows affected: " + rowsAffected);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                sc.close();
                conn.close();
                pstmt.close();
                if(rs != null){
                    rs.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
            System.out.println("Connection closed");
        }
    }
}
