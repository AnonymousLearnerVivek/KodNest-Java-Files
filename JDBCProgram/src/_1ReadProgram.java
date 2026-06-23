import java.sql.*;

public class _1ReadProgram {
    public static void main(String[] args) {

        try {
            // Loading the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is Loaded");

            // Establishing the Connection
            // .getConnection(url, username, password) will take 3 parameter
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/janbatch", "root", "system");
            System.out.println("Connected to database successfully");

            // create a statement medium
            Statement stmt = conn.createStatement();
            System.out.println("Medium is created");

            // Query
            String sql = "select * from batches";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("Query is executed");

            // Display the resultSet
            while(rs.next()){ // resultSet rs will point to the row
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            System.out.println("Result is displayed");
            // Close the connections
            stmt.close();
            conn.close();
            rs.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
