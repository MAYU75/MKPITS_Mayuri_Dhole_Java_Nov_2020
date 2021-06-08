//Java program to demonstrate how to create table 'employee1'
// in a database using JDBC connection.

package src.com.mkpits.java.jdbcexamples;

import java.sql.*;

public class JdbcExToDemonstrateHowToCreateTableEmployee {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5433/Mkpits",
                            "postgres", "SA");
            System.out.println("Opened database successfully");
            stmt = con.createStatement();
            String str = "create table employee1(empid int primary key, empname varchar(50))";
            stmt.executeUpdate(str);
            System.out.println("table successfully created");
            con.close();
        } catch (Exception ee) {
            //code to connect java with mysql database
            System.out.println(ee.toString());
        }
    }
}
