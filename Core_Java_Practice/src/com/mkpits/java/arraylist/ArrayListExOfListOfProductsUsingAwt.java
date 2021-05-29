//Java program to collect list of products using AWT.

package src.com.mkpits.java.arraylist;

import java.awt.*;
import java.util.*;
import java.awt.event.*;

class Product {
    int pid;
    String pname;
    int pquantity;
    float price;

    public Product(int pid, String pname, int pquantity, float price) {
        this.pid = pid;
        this.pname = pname;
        this.pquantity = pquantity;
        this.price = price;
    }
}

public class ArrayListExOfListOfProductsUsingAwt extends Frame {
    Label l1, l2, l3, l4;
    TextField t1, t2, t3, t4;
    Button b1, b2, b3,b4;
    TextArea ta;
    ArrayList<String> product = new ArrayList<String>();

    ArrayListExOfListOfProductsUsingAwt() {
        l1 = new Label("Enter Product Id:");
        l1.setBounds(10, 50, 150, 30);
        add(l1);

        t1 = new TextField();
        t1.setBounds(160, 50, 150, 30);
        add(t1);

        l2 = new Label("Enter Product Name:");
        l2.setBounds(10, 100, 150, 30);
        add(l2);

        t2 = new TextField();
        t2.setBounds(160, 100, 150, 30);
        add(t2);

        l3 = new Label("Enter Product Quantity:");
        l3.setBounds(10, 150, 150, 30);
        add(l3);

        t3 = new TextField();
        t3.setBounds(160, 150, 150, 30);
        add(t3);

        l4 = new Label("Enter Product Price:");
        l4.setBounds(10, 200, 150, 30);
        add(l4);

        t4 = new TextField();
        t4.setBounds(160, 200, 150, 30);
        add(t4);

        b1 = new Button("Add Product");
        b1.setBounds(50, 250, 100, 30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pr = new String();
                pr = ("\nProduct ID:" + t1.getText() + "\nProduct Name :" + t2.getText() +
                        "\nProduct Quantity :" + t3.getText() + "\nProduct Price :" + t4.getText());
                product.add(pr);
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            }
        });
        add(b1);

        b2 = new Button("Display Product");
        b2.setBounds(170, 250, 100, 30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                for (String str : product) {
                    sb.append(str);
                }
                ta.setText(sb.toString());
            }
        });
        add(b2);

        b3 = new Button("Sort Product");
        b3.setBounds(290, 250, 100, 30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Collections.sort(product);
                StringBuilder sb = new StringBuilder();
                for (String str : product) {
                    sb.append(str);
                }
                ta.setText(sb.toString());
            }
        });
        add(b3);

        b4 = new Button("Remove All Products");
        b4.setBounds(400, 250, 150, 30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                product.removeAll(product);
                ta.setText("Product details removed.");
            }
        });
        add(b4);

        ta = new TextArea("Product List");
        ta.setBounds(50, 300, 300, 200);
        add(ta);

        setLayout(null);
        setSize(500, 550);
        setVisible(true);
    }

    public static void main(String[] args) {
        ArrayListExOfListOfProductsUsingAwt pr = new ArrayListExOfListOfProductsUsingAwt();
    }


}
