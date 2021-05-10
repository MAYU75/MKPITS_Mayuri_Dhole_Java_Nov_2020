package src.com.mkpits.java.swingexamples;

import javax.swing.*;

public class ExToDemonstrateHowToCreateButtonUsingSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton("Click Here");
        b.setBounds(150, 150, 95, 30);
        f.add(b);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
