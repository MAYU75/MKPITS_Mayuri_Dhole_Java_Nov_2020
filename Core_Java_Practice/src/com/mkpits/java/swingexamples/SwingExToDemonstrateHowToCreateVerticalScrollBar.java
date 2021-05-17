//Java program of Swing to demonstrate how to create Vertical ScrollBar.

package src.com.mkpits.java.swingexamples;

import javax.swing.*;

public class SwingExToDemonstrateHowToCreateVerticalScrollBar {
    SwingExToDemonstrateHowToCreateVerticalScrollBar() {
        JFrame f = new JFrame("Scrollbar Example");
        JScrollBar s = new JScrollBar();
        s.setBounds(100, 100, 50, 100);
        f.add(s);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new SwingExToDemonstrateHowToCreateVerticalScrollBar();
    }
}
