//Java program to demonstrate how to create Supplier form
// with class Supplier for adding new supplier and updating,
// removing and searching supplier details using Swing.

package src.com.mkpits.java.jdbcexamples;

import java.sql.*;

public class SupplierClassWithAddUpdateRemoveAndSearchMethods {
    int sup_id;
    String sup_name, sup_addr, pname;
    int CP;
    int pid;
    Connection con = null;
    Statement stmt = null;

    public void connect() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5433/mkpits1",
                            "postgres", "SA");
            System.out.println("Database connected");
        } catch (Exception ee) {
            System.out.println(ee.toString());
        }
    }

    public String addSupplier(int sup_id, String sup_name, String sup_addr, String pname, int CP, int pid) {
        this.sup_id = sup_id;
        this.sup_name = sup_name;
        this.sup_addr = sup_addr;
        this.pname = pname;
        this.CP = CP;
        this.pid = pid;
        try {
            connect();
            String str = "insert into supplier values(" + sup_id + ",'" + sup_name + "','" + sup_addr + "','" + pname + "','" + CP + "','" + pid + "')";
            stmt = con.createStatement();
            stmt.executeUpdate(str);
            stmt.close();
            con.close();
            return "Supplier added successfully";

        } catch (Exception ee) {
            return ee.toString();
        }
    }

    public String updateSupplier(int sup_id, String sup_name, String sup_addr, String pname, int CP, int pid) {
        this.sup_id = sup_id;
        this.sup_name = sup_name;
        this.sup_addr = sup_addr;
        this.pname = pname;
        this.CP = CP;
        this.pid = pid;
        try {
            connect();
            String str = "update supplier set sup_name='" + sup_name + "',sup_addr='" + sup_addr + "',pname='" + pname + "', CP=" + CP + ", pid=" + pid + " where sup_id=" + sup_id + " ";
            stmt = con.createStatement();
            stmt.executeUpdate(str);
            stmt.close();
            con.close();
            return "Supplier updated successfully";

        } catch (Exception ee) {
            return ee.toString();
        }
    }

    public String removeSupplier(int sup_id) {
        this.sup_id = sup_id;
        try {
            connect();
            String str = "delete from supplier where sup_id=" + sup_id + "";
            stmt = con.createStatement();
            stmt.executeUpdate(str);
            stmt.close();
            con.close();
            return "Supplier removed successfully";

        } catch (Exception ee) {
            return ee.toString();
        }
    }

    public String searchSupplier(int sup_id) {
        this.sup_id = sup_id;
        int flag = 0;
        String res = null;
        try {
            connect();
            String str = "select * from supplier where sup_id=" + sup_id + "";
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(str);
            while (rs.next()) {
                flag = 1;
                this.sup_name = rs.getString("sup_name");
                this.sup_addr = rs.getString("sup_addr");
                this.pname = rs.getString("pname");
                this.CP = rs.getInt("CP");
                this.pid = rs.getInt("pid");
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
