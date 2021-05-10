//Java program of Swing to demonstrate JButton with ActionListener.

package src.com.mkpits.java.swingexamples;

import java.awt.event.*;
import javax.swing.*;

public class SwingExToDemonstrateJButtonWithActionListener {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Example");
        final JTextField tf = new JTextField();
        tf.setBounds(100, 50, 250, 30);
        JButton b = new JButton("Click Here");
        b.setBounds(120, 100, 150, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome to Java Programming.");
            }
        });
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
