//Java program to demonstrate how to create Shop form with class Shop using Swing.

package src.com.mkpits.java.jdbcexamples;

import java.sql.*;

public class Shop {
    int shop_no;
    String city;
    String owner;
    String address;
    Connection con = null;
    Statement stmt = null;

    public void connect() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5433/mkpits1",
                            "postgres", "SA");

        } catch (Exception ee) {
            System.out.println(ee.toString());
        }
    }

    public String addShop(int shop_no, String city, String owner, String address) {
        this.shop_no = shop_no;
        this.city = city;
        this.owner = owner;
        this.address = address;
        try {
            connect();
            String str = "insert into shop values(" + shop_no + ",'" + city + "','" + owner + "','" + address + "')";
            stmt = con.createStatement();
            stmt.executeUpdate(str);
            stmt.close();
            con.close();
            return "Shop added successfully";

        } catch (Exception ee) {
            return ee.toString();
        }
    }

    public String updateShop(int shop_no, String city, String owner, String address) {
        this.shop_no = shop_no;
        this.city = city;
        this.owner = owner;
        this.address = address;
        try {
            connect();
            String str = "update shop set city='" + city + "',owner='" + owner + "',address='" + address + "' where shop_no=" + shop_no + "";
            stmt = con.createStatement();
            stmt.executeUpdate(str);
            stmt.close();
            con.close();
            return "Shop updated successfully";

        } catch (Exception ee) {
            return ee.toString();
        }
    }

    public String removeShop(int shop_no) {
        this.shop_no = shop_no;
        try {
            connect();
            String str = "delete from shop where shop_no=" + shop_no + "";
            stmt = con.createStatement();
            stmt.executeUpdate(str);
            stmt.close();
            con.close();
            return "Shop removed successfully";

        } catch (Exception ee) {
            return ee.toString();
        }
    }

    public String searchShop(int shop_no) {
        this.shop_no = shop_no;
        int flag = 0;
        String res = null;
        try {
            connect();
            String str = "select * from shop where shop_no=" + shop_no + "";
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(str);
            while (rs.next()) {
                flag = 1;
                this.city = rs.getString("city");
                this.owner = rs.getString("owner");
                this.address = rs.getString("address");
            }
            rs.close();
            stmt.close();
            con.close();
            if (flag == 0) {
                res = "No record found";
            }
            return res;

        } catch (Exception ee) {
            return ee.toString();
        }
    }
}
