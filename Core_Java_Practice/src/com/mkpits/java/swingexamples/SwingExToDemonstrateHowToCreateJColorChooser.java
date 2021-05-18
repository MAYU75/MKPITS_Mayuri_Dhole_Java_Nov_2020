//Java program of Swing to demonstrate how to create JColorChooser.

package src.com.mkpits.java.swingexamples;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class SwingExToDemonstrateHowToCreateJColorChooser extends JFrame implements ActionListener {
    JButton b;
    Container c;

    SwingExToDemonstrateHowToCreateJColorChooser() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        b = new JButton("color");
        b.addActionListener(this);
        c.add(b);
    }

    public void actionPerformed(ActionEvent e) {
        Color initialcolor = Color.RED;
        Color color = JColorChooser.showDialog(this, "Select a color", initialcolor);
        c.setBackground(color);
    }

    public static void main(String[] args) {
        SwingExToDemonstrateHowToCreateJColorChooser ch = new SwingExToDemonstrateHowToCreateJColorChooser();
        ch.setSize(400, 400);
        ch.setVisible(true);
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
