//Java program to demonstrate how to insert records into the table 'employee1'.

package src.com.mkpits.java.jdbcexamples;

import java.sql.*;
import java.util.*;

public class JdbcExToDemonstrateHowToInsertRecordsIntoTableEmployee {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter empno");
        int empid = sc.nextInt();
        System.out.println("enter empname");
        String empname = sc.next();

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5433/Mkpits",
                            "postgres", "SA");
            System.out.println("Opened database successfully");
            stmt = con.createStatement();
            String str = "insert into employee1(empid,empname) values(" + empid + ",'" + empname + "')";
            stmt.executeUpdate(str);
            System.out.println("record inserted successfully");
            con.close();
        } catch (Exception ee) {
            //code to connect java with mysql database
            System.out.println(ee.toString());
        }
    }
}
