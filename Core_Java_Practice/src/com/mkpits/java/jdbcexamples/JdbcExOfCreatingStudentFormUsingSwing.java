//Java program to demonstrate how to create Student form having student name, address,
//gender, hobby and course using swing.

package src.com.mkpits.java.jdbcexamples;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class JdbcExOfCreatingStudentFormUsingSwing extends JFrame {
    JRadioButton rb1;
    JRadioButton rb2;
    ButtonGroup bg;
    JCheckBox hb1, hb2;
    JComboBox course;

    JdbcExOfCreatingStudentFormUsingSwing() {
        JLabel l14 = new JLabel("Student form");
        l14.setBounds(100, 40, 240, 25);
        add(l14);
        JLabel l1 = new JLabel("Student Name :");
        l1.setBounds(10, 80, 240, 25);
        add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(260, 80, 240, 25);
        add(t1);

        JLabel l2 = new JLabel("Address");
        l2.setBounds(10, 120, 240, 25);
        add(l2);

        //JPasswordField t2 = new JPasswordField();
        //t2.setEchoChar('*');
        JTextField t2 = new JTextField();
        t2.setBounds(260, 120, 240, 25);
        add(t2);

        JLabel lg = new JLabel("Gender");
        lg.setBounds(10, 160, 240, 25);
        add(lg);

        rb1 = new JRadioButton("male");
        rb1.setBounds(260, 160, 100, 25);
        add(rb1);
        rb2 = new JRadioButton("female");
        rb2.setBounds(400, 160, 100, 25);
        add(rb2);
        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        JLabel lc = new JLabel("Hobby ");
        lc.setBounds(10, 200, 240, 25);
        add(lc);

        hb1 = new JCheckBox("Music");
        hb1.setBounds(260, 200, 100, 25);
        add(hb1);
        hb2 = new JCheckBox("Reading");
        hb2.setBounds(400, 200, 100, 25);
        add(hb2);


        JLabel lci = new JLabel("Course");
        lci.setBounds(10, 240, 240, 25);
        add(lci);
        String[] ct = {"java", "oracle", "MySQL"};
        course = new JComboBox(ct);
        course.setBounds(260, 240, 100, 25);
        add(course);

        JLabel l21 = new JLabel("Status");
        l21.setBounds(10, 400, 240, 25);
        add(l21);


        JButton b1 = new JButton("Save");
        b1.setBounds(100, 360, 80, 20);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentClassForStudentForm student = new StudentClassForStudentForm();
                student.setStudentName(t1.getText());
                student.setAddress(t2.getText());

                String g = null;
                if (rb1.isSelected())
                    student.setGender("male");
                else if (rb2.isSelected())
                    student.setGender("female");

                String hobby = null;
                if (hb1.isSelected())
                    hobby = "Music";
                if (hb2.isSelected())
                    hobby = hobby + " Reading";


                student.setHobby(hobby);

                String course1 = course.getSelectedItem().toString();
                student.setCourse(course1);

                String result = student.saveregister();

                l21.setText(result);
                t1.setText("");
                t2.setText("");
            }
        });
        add(b1);

        setSize(700, 500);
        setTitle("Student Form");
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JdbcExOfCreatingStudentFormUsingSwing f = new JdbcExOfCreatingStudentFormUsingSwing();
    }

}
