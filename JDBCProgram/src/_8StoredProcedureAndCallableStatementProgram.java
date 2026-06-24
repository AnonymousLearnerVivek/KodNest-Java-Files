import java.sql.*;
import java.util.Scanner;

public class _8StoredProcedureAndCallableStatementProgram {
    public static void main(String[] args) {
        Connection conn = null;
        CallableStatement cstmt = null; // use when you want to use the Procedure statements in sql
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);

        try {
            // Loading the Driverv
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is Loaded");

            // Establishing the Connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/janbatch?user=root&password=system");
            System.out.println("Connected to database successfully");

            // Call Procedure Query
            String query = "call bank_procedure(?)";

            // craete a Callable statement medium
            cstmt = conn.prepareCall(query);
            System.out.println("Enter your accNo to check the balance");
            int accNo = sc.nextInt();

            cstmt.setInt(1, accNo);

            boolean res = cstmt.execute();
            if (res) {
                rs = cstmt.getResultSet();
                while (rs.next()) {
                    System.out.println(rs.getString(2) + " your account balance is: " + rs.getInt(3));
                }
            } else {
                int rowsAffected = cstmt.getUpdateCount();
                System.out.println("Rows affected: " + rowsAffected);
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
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            System.out.println("Connection closed");
        }
    }
}
/*
# What is Stored Procedure and CallableStatement?
    Imagine this: You are a chef at a busy restaurant 🍜. Every day, customers order a “special combo meal” that includes a starter,
    main course, and dessert. Instead of cooking each dish from scratch every time, wouldn’t it be smart to create a ready-made recipe
    in your kitchen? This way, whenever someone orders the combo, you just call the recipe, and the kitchen serves it instantly!

    In databases, we have something very similar called a Stored Procedure, and in Java, we use CallableStatement to call these recipes.

Q1. What is a Stored Procedure?
Standard Definition:
    A Stored Procedure is a precompiled group of SQL statements stored in the database that can be executed as a single unit.

Simple Explanation:
    Think of it as a ready-made recipe in the database. Instead of writing the same SQL code again and again,
    you just call this recipe whenever needed.

# Introduction to CallableStatement:
    Remember how we talked about stored procedures? They’re like a ready-made playlist of your favorite songs saved in your database.

    Now, what if you’re sitting on the sofa 🛋️ and want to play that playlist? You wouldn’t get up and hit play on each song manually,
    right? Instead, you’d grab your remote control and press a single button to start the music.
    In Java, that remote control is called CallableStatement.

    It lets your Java program call stored procedures in the database with ease—just like pressing play on your playlist.

Q1. What is CallableStatement?
Standard Definition:
    A CallableStatement is part of the JDBC API that allows Java applications to call stored procedures stored in a database.

Simple Explanation:
    CallableStatement in Java is like giving instructions to the database to run a ready-made set of SQL commands (stored procedure).
    Instead of writing the same SQL queries again and again in your Java code, you just “call” the stored procedure by its name.
    It’s like asking your music app to play a saved playlist—you press play, and it takes care of everything.
 */