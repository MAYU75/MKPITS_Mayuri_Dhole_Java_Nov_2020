package src.com.mkpits.java.jdbcexamples;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class JdbcExOfRegistrationWithUsernamePassword extends Frame {
    JdbcExOfRegistrationWithUsernamePassword() {
        Label l14 = new Label("Registration form");
        l14.setBounds(100, 40, 240, 25);
        add(l14);
        Label l1 = new Label("username :");
        l1.setBounds(10, 80, 240, 25);
        add(l1);

        TextField t1 = new TextField();
        t1.setBounds(260, 80, 240, 25);
        add(t1);

        Label l2 = new Label("Password");
        l2.setBounds(10, 120, 240, 25);
        add(l2);

        TextField t2 = new TextField();
        t2.setEchoChar('*');
        t2.setBounds(260, 120, 240, 25);
        add(t2);
        Label l21 = new Label("Status");
        l21.setBounds(10, 200, 240, 25);
        add(l21);


        Button b1 = new Button("register");
        b1.setBounds(100, 160, 80, 20);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String un = t1.getText();
                String p = t2.getText();
                Connection con = null;
                Statement st = null;
                try {
                    Class.forName("org.postgresql.Driver");
                    con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/Mkpits", "postgres", "SA");
                    //System.out.println("connected");
                    st = con.createStatement();
                    String sql = "insert into register(Username,Password) values('" + un + "','" + p + "')";
                    st.executeUpdate(sql);
                    l21.setText("registered succ.");
                    t1.setText("");
                    t2.setText("");
                    st.close();
                    con.close();
                } catch (Exception ee) {
                    System.out.println(ee.toString());
                }

                //t3.setText("Sum is " + (fn+sn));

            }
        });
        add(b1);

        setSize(700, 500);
        setTitle("Registration");
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JdbcExOfRegistrationWithUsernamePassword f = new JdbcExOfRegistrationWithUsernamePassword();
    }

}
