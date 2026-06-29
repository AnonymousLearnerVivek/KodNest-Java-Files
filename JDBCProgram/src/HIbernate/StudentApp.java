package HIbernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
// Hibernate is a framework which is built above JDBC
// Hibernate is also knows as ORM (Ob)
public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/janbatch?user=root&password=system");
            String sql = "insert into student values(?,?,?,?,?)";
            PreparedStatement psmt = conn.prepareStatement(sql);
            System.out.println("Enter Student ID, name, age, gender, marks");
            psmt.setInt(1, sc.nextInt());
            psmt.setString(2, sc.next());
            psmt.setInt(3, sc.nextInt());
            psmt.setString(4, sc.next());
            psmt.setInt(5, sc.nextInt());

            int rowsAffected = psmt.executeUpdate();
            System.out.println("rows affected: " + rowsAffected);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
