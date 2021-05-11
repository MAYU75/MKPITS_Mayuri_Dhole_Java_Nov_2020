//Java program of Swing to demonstrate how to create TextArea.

package src.com.mkpits.java.swingexamples;

import javax.swing.*;

public class SwingExToDemonstrateHowToCreateTextArea {
    SwingExToDemonstrateHowToCreateTextArea() {
        JFrame f = new JFrame();
        JTextArea area = new JTextArea("Welcome to Java programming");
        area.setBounds(10, 30, 200, 200);
        f.add(area);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new SwingExToDemonstrateHowToCreateTextArea();
    }
}
