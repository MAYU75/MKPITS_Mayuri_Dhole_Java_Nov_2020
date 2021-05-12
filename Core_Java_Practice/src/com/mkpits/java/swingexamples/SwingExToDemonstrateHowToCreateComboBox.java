//Java program of Swing to demonstrate how to create ComboBox.

package src.com.mkpits.java.swingexamples;

import javax.swing.*;

public class SwingExToDemonstrateHowToCreateComboBox {
    JFrame f;

    SwingExToDemonstrateHowToCreateComboBox() {
        f = new JFrame("ComboBox Example");
        String country[] = {"India", "Australia", "U.S.A", "England", "New Zealand"};
        JComboBox cb = new JComboBox(country);
        cb.setBounds(50, 50, 90, 20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(400, 500);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new SwingExToDemonstrateHowToCreateComboBox();
    }
}
