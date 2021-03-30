//Java program to accept 2 numbers from the user and display the addition of 2 numbers.

package src.com.mkpits.java.awtexamples;

import java.awt.*;
import java.awt.event.*;

public class ExOfEventHandlingToAcceptTwoNumbersAndDisplayAddition extends Frame {
    ExOfEventHandlingToAcceptTwoNumbersAndDisplayAddition() {
        Label l1 = new Label("num1");
        l1.setBounds(10, 40, 240, 25);
        add(l1);

        TextField t1 = new TextField();
        t1.setBounds(260, 40, 240, 25);
        add(t1);

        Label l2 = new Label("num2");
        l2.setBounds(10, 70, 240, 25);
        add(l2);

        TextField t2 = new TextField();
        t2.setBounds(260, 70, 240, 25);
        add(t2);


        Label l3 = new Label("res");
        l3.setBounds(10, 130, 240, 25);
        add(l3);
        TextField t3 = new TextField();
        t3.setBounds(260, 130, 240, 25);
        add(t3);

        Button b1 = new Button("addition");
        b1.setBounds(100, 100, 80, 20);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str1 = t1.getText();
                double fn = Double.parseDouble(str1);
                double sn = Double.parseDouble(t2.getText());

                t3.setText("Sum is " + (fn + sn));

            }
        });
        add(b1);

        setSize(500, 500);
        setTitle("calculator");
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        ExOfEventHandlingToAcceptTwoNumbersAndDisplayAddition f = new ExOfEventHandlingToAcceptTwoNumbersAndDisplayAddition();
    }

}
