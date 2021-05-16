//Java program of Swing to demonstrate JOptionPane with showInputDialog().

package src.com.mkpits.java.swingexamples;

import javax.swing.*;

public class SwingExToDemonstrateJOptionPaneWithShowInputDialogMethod {
    JFrame f;

    SwingExToDemonstrateJOptionPaneWithShowInputDialogMethod() {
        f = new JFrame();
        String name = JOptionPane.showInputDialog(f, "Enter Name");
    }

    public static void main(String[] args) {
        new SwingExToDemonstrateJOptionPaneWithShowInputDialogMethod();
    }
}
