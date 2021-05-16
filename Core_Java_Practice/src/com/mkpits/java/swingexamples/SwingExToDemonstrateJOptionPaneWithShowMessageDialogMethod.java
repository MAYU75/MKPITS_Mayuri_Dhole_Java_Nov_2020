//Java program of Swing to demonstrate JOptionPane with showMessageDialog().

package src.com.mkpits.java.swingexamples;

import javax.swing.*;

public class SwingExToDemonstrateJOptionPaneWithShowMessageDialogMethod {
    JFrame f;

    SwingExToDemonstrateJOptionPaneWithShowMessageDialogMethod() {
        f = new JFrame();
        JOptionPane.showMessageDialog(f, "Successfully Updated.", "Alert", JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {
        new SwingExToDemonstrateJOptionPaneWithShowMessageDialogMethod();
    }
}
