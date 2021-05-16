//Java program of Swing to demonstrate how to create OptionPane.

package src.com.mkpits.java.swingexamples;

import javax.swing.*;

public class SwingExToDemonstrateHowToCreateOptionPane {
    JFrame f;

    SwingExToDemonstrateHowToCreateOptionPane() {
        f = new JFrame();
        JOptionPane.showMessageDialog(f, "Hello, Welcome to Java Programming.");
    }

    public static void main(String[] args) {
        new SwingExToDemonstrateHowToCreateOptionPane();
    }
}
