//Java program to demonstrate event handling by Anonymous class with two buttons.

package src.com.mkpits.java.awtexamples;

import java.awt.*;
import java.awt.event.*;

public class ExOfEventHandlingByAnonymousClassWithTwoButtons extends Frame {
    TextField tf;

    ExOfEventHandlingByAnonymousClassWithTwoButtons() {

        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);

        Button b = new Button("click me");
        b.setBounds(100, 120, 80, 30);


        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("welcome Mayuri");
            }
        });
        Button b1 = new Button("clear");
        b1.setBounds(100, 160, 80, 30);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
            }
        });

        add(b);
        add(tf);
        add(b1);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ExOfEventHandlingByAnonymousClassWithTwoButtons();
    }
}

