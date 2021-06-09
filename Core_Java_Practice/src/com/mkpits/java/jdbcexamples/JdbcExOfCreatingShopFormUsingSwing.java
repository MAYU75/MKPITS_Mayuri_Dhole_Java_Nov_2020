//Java program to demonstrate how to create Shop form using Swing.

package src.com.mkpits.java.jdbcexamples;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class JdbcExOfCreatingShopFormUsingSwing extends JFrame {
    JLabel l1, l2, l3, l4, l5;
    JTextField t1, t2, t3, t4;
    JButton b1, b2, b3, b4;
    Connection con = null;
    Statement stmt = null;

    public JdbcExOfCreatingShopFormUsingSwing() {
        l1 = new JLabel("shop no.");
        l1.setBounds(20, 50, 200, 20);
        add(l1);
        t1 = new JTextField();
        t1.setBounds(230, 50, 200, 20);
        add(t1);

        l2 = new JLabel("City.");
        l2.setBounds(20, 100, 200, 20);
        add(l2);
        t2 = new JTextField();
        t2.setBounds(230, 100, 200, 20);
        add(t2);

        l3 = new JLabel("Owner.");
        l3.setBounds(20, 150, 200, 20);
        add(l3);
        t3 = new JTextField();
        t3.setBounds(230, 150, 200, 20);
        add(t3);

        l4 = new JLabel("Address.");
        l4.setBounds(20, 200, 200, 20);
        add(l4);
        t4 = new JTextField();
        t4.setBounds(230, 200, 200, 20);
        add(t4);

        b1 = new JButton("Save");
        b1.setBounds(100, 250, 100, 30);
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
                    String str = "insert into shop values('" + t1.getText() + "','" + t2.getText() + "','" + t3.getText() + "','" + t4.getText() + "')";
                    stmt.executeUpdate(str);
                    con.close();
                    l5.setText("record inserted successfully");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                } catch (Exception ee) {
                    l5.setText(ee.toString());
                }
            }
        });
        add(b1);

        b2 = new JButton("Update");
        b2.setBounds(220, 250, 100, 30);
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
                    String str = "update shop set city='" + t2.getText() + "',owner='" + t3.getText() + "',address='" + t4.getText() + "' where shop_no='" + t1.getText() + "'";
                    stmt.executeUpdate(str);
                    con.close();
                    l5.setText("record updated successfully");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");


                } catch (Exception ee) {
                    l5.setText(ee.toString());
                }

            }
        });
        add(b2);

        b3 = new JButton("Delete");
        b3.setBounds(330, 250, 100, 30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("org.postgresql.Driver");
                    con = DriverManager
                            .getConnection("jdbc:postgresql://localhost:5433/mkpits1",
                                    "postgres", "SA");
                    stmt = con.createStatement();
                    String str = "delete from shop where shop_no='" + t1.getText() + "'";
                    stmt.executeUpdate(str);
                    con.close();
                    l5.setText("record deleted successfully");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");


                } catch (Exception ee) {
                    l5.setText(ee.toString());
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
                    String str = "select * from shop where shop_no='" + t1.getText() + "'";
                    ResultSet rs = stmt.executeQuery(str);
                    int flag = 0;
                    while (rs.next()) {
                        flag = 1;
                        t2.setText(rs.getString("city"));
                        t3.setText(rs.getString("owner"));
                        t4.setText(rs.getString("address"));
                    }
                    if (flag == 0) {
                        l5.setText("record not found");
                        t2.setText("");
                        t3.setText("");
                        t4.setText("");
                    }
                    rs.close();
                    con.close();


                } catch (Exception ee) {
                    l5.setText(ee.toString());
                }

            }
        });
        add(b4);

        l5 = new JLabel("Status.");
        l5.setBounds(10, 300, 400, 20);
        add(l5);

        setTitle("shop entry form");
        setSize(600, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        JdbcExOfCreatingShopFormUsingSwing sf = new JdbcExOfCreatingShopFormUsingSwing();
    }
}
