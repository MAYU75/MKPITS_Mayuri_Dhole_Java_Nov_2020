//Java program of Swing to display image on Button.

package src.com.mkpits.java.swingexamples;

import javax.swing.*;

public class SwingExOfDisplayingImageOnButton {
    SwingExOfDisplayingImageOnButton() {
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton(new ImageIcon("D:\\register.jpg"));
        b.setBounds(30, 100, 200, 40);
        f.add(b);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SwingExOfDisplayingImageOnButton();
    }
}
