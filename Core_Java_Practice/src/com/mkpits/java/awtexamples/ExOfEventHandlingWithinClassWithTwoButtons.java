//Java program to demonstrate event handling within class with two buttons.

package src.com.mkpits.java.awtexamples;

import java.awt.*;
import java.awt.event.*;

public class ExOfEventHandlingWithinClassWithTwoButtons extends Frame implements ActionListener {
    TextField tf;
    Button b1, b2;

    ExOfEventHandlingWithinClassWithTwoButtons() {
        tf = new TextField();
        tf.setBounds(10, 50, 200, 50);
        b1 = new Button("click me");
        b1.setBounds(50, 150, 100, 50);
        b1.addActionListener(this);
        b2 = new Button("clear");
        b2.setBounds(200, 150, 100, 50);
        b2.addActionListener(this);
        add(tf);
        add(b1);
        add(b2);
        setTitle("Event Example Using Two Buttons");
        setLayout(null);
        setSize(350, 350);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {
            tf.setText("Welcome Mayuri");
        }
        if (ae.getSource() == b2) {
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        ExOfEventHandlingWithinClassWithTwoButtons e1 = new ExOfEventHandlingWithinClassWithTwoButtons();

    }

}
