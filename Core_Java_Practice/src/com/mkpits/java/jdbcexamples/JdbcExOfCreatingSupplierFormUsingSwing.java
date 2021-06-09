//Java program to demonstrate how to create Supplier form using Swing.

package src.com.mkpits.java.jdbcexamples;

import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class JdbcExOfCreatingSupplierFormUsingSwing extends JFrame {
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField t1, t2, t3, t4, t5, t6;
    JButton b1, b2, b3, b4;
    Connection con = null;
    Statement stmt = null;

    public JdbcExOfCreatingSupplierFormUsingSwing() {
        l1 = new JLabel("Supplier ID:");
        l1.setBounds(20, 50, 200, 20);
        add(l1);
        t1 = new JTextField();
        t1.setBounds(230, 50, 200, 20);
        add(t1);

        l2 = new JLabel("Supplier Name:");
        l2.setBounds(20, 100, 200, 20);
        add(l2);
        t2 = new JTextField();
        t2.setBounds(230, 100, 200, 20);
        add(t2);

        l3 = new JLabel("Supplier Address:");
        l3.setBounds(20, 150, 200, 20);
        add(l3);
        t3 = new JTextField();
        t3.setBounds(230, 150, 200, 20);
        add(t3);

        l4 = new JLabel("Product Name:");
        l4.setBounds(20, 200, 200, 20);
        add(l4);
        t4 = new JTextField();
        t4.setBounds(230, 200, 200, 20);
        add(t4);

        l5 = new JLabel("Cost Price:");
        l5.setBounds(20, 250, 200, 20);
        add(l5);
        t5 = new JTextField();
        t5.setBounds(230, 250, 200, 20);
        add(t5);

        l6 = new JLabel("Product ID:");
        l6.setBounds(20, 300, 200, 20);
        add(l6);
        t6 = new JTextField();
        t6.setBounds(230, 300, 200, 20);
        add(t6);

        b1 = new JButton("Save");
        b1.setBounds(100, 350, 100, 30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("org.postgresql.Driver");
                    con = DriverManager
                            .getConnection("jdbc:postgresql://localhost:5433/mkpits1",
                                    "postgres", "SA");
                    System.out.println("Opened database successfully");
                    stmt = con.createStatement();
                    String str = "insert into supplier values('" + t1.getText() + "','" + t2.getText() + "','" + t3.getText() + "','" + t4.getText() + "','" + t5.getText() + "','" + t6.getText() + "')";
                    stmt.executeUpdate(str);
                    con.close();
                    l5.setText("record inserted successfully");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");
                } catch (Exception ee) {
                    l7.setText(ee.toString());
                }
            }
        });
        add(b1);

        b2 = new JButton("Update");
        b2.setBounds(220, 350, 100, 30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("org.postgresql.Driver");
                    con = DriverManager
                            .getConnection("jdbc:postgresql://localhost:5433/mkpits1",
                                    "postgres", "SA");
                    //System.out.println("Opened database successfully");
                    stmt = con.createStatement();
                    String str = "update supplier set sup_name='" + t2.getText() + "',sup_addr='" + t3.getText() + "',pname='" + t4.getText() + "',CP='" + t5.getText() + "',pid='" + t6.getText() + "' where sup_id='" + t1.getText() + "'";
                    stmt.executeUpdate(str);
                    con.close();
                    l5.setText("record updated successfully");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");
                } catch (Exception ee) {
                    l7.setText(ee.toString());
                }

            }
        });
        add(b2);

        b3 = new JButton("Delete");
        b3.setBounds(330, 350, 100, 30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("org.postgresql.Driver");
                    con = DriverManager
                            .getConnection("jdbc:postgresql://localhost:5433/mkpits1",
                                    "postgres", "SA");
                    stmt = con.createStatement();
                    String str = "delete from supplier where sup_id='" + t1.getText() + "'";
                    stmt.executeUpdate(str);
                    con.close();
                    l5.setText("record deleted successfully");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");
                } catch (Exception ee) {
                    l7.setText(ee.toString());
                }

            }
        });
        add(b3);

        b4 = new JButton("Search");
        b4.setBounds(450, 50, 100, 30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("org.postgresql.Driver");
                    con = DriverManager
                            .getConnection("jdbc:postgresql://localhost:5433/mkpits1",
                                    "postgres", "SA");
                    stmt = con.createStatement();
                    String str = "select * from supplier where sup_id='" + t1.getText() + "'";
                    ResultSet rs = stmt.executeQuery(str);
                    int flag = 0;
                    while (rs.next()) {
                        flag = 1;
                        t2.setText(rs.getString("sup_name"));
                        t3.setText(rs.getString("sup_addr"));
                        t4.setText(rs.getString("pname"));
                        t5.setText(rs.getString("CP"));
                        t6.setText(rs.getString("pid"));
                    }
                    if (flag == 0) {
                        l5.setText("record not found");
                        t2.setText("");
                        t3.setText("");
                        t4.setText("");
                        t5.setText("");
                        t6.setText("");
                    }
                    rs.close();
                    con.close();


                } catch (Exception ee) {
                    l7.setText(ee.toString());
                }

            }
        });
        add(b4);

        l7 = new JLabel("Status.");
        l7.setBounds(10, 400, 400, 20);
        add(l7);

        setTitle("Supplier entry form");
        setSize(700, 600);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        JdbcExOfCreatingSupplierFormUsingSwing sp = new JdbcExOfCreatingSupplierFormUsingSwing();
    }
}
