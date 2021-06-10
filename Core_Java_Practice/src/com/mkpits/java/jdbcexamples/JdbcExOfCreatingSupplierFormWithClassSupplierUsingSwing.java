//Java program to demonstrate how to create Supplier form
// with class Supplier for adding new supplier and updating,
// removing and searching supplier details using Swing.

package src.com.mkpits.java.jdbcexamples;

import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class JdbcExOfCreatingSupplierFormWithClassSupplierUsingSwing extends JFrame {
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField t1, t2, t3, t4, t5, t6;
    JButton b1, b2, b3, b4;
    Connection con = null;
    Statement stmt = null;
    //SupplierClassWithAddUpdateRemoveAndSearchMethods s1 = null;

    public JdbcExOfCreatingSupplierFormWithClassSupplierUsingSwing() {
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
                    SupplierClassWithAddUpdateRemoveAndSearchMethods s1 = new SupplierClassWithAddUpdateRemoveAndSearchMethods();
                    String result = s1.addSupplier(Integer.parseInt(t1.getText()), t2.getText(), t3.getText(), t4.getText(), Integer.parseInt(t5.getText()), Integer.parseInt(t6.getText()));
                    l7.setText(result);
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
                    SupplierClassWithAddUpdateRemoveAndSearchMethods s1 = new SupplierClassWithAddUpdateRemoveAndSearchMethods();
                    String result = s1.updateSupplier(Integer.parseInt(t1.getText()), t2.getText(), t3.getText(), t4.getText(), Integer.parseInt(t5.getText()), Integer.parseInt(t6.getText()));
                    l7.setText(result);
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
                    SupplierClassWithAddUpdateRemoveAndSearchMethods s1 = new SupplierClassWithAddUpdateRemoveAndSearchMethods();
                    String result = s1.removeSupplier(Integer.parseInt(t1.getText()));
                    l7.setText(result);
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
                    SupplierClassWithAddUpdateRemoveAndSearchMethods s1 = new SupplierClassWithAddUpdateRemoveAndSearchMethods();
                    String r = s1.searchSupplier(Integer.parseInt(t1.getText()));
                    t2.setText(s1.sup_name);
                    t3.setText(s1.sup_addr);
                    t4.setText(s1.pname);
                    t5.setText(String.valueOf(s1.CP));
                    t6.setText(String.valueOf(s1.pid));
                    l7.setText(r);
                } catch (Exception ee) {
                    l7.setText(ee.toString());
                }

            }
        });
        add(b4);

        l7 = new JLabel("Status.");
        l7.setBounds(10, 400, 600, 20);
        add(l7);

        setTitle("Supplier entry form");
        setSize(700, 600);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        JdbcExOfCreatingSupplierFormWithClassSupplierUsingSwing sp = new JdbcExOfCreatingSupplierFormWithClassSupplierUsingSwing();
    }
}
