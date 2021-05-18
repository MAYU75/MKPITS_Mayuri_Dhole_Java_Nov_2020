//Java program of Swing to demonstrate how to create JSlider.

package src.com.mkpits.java.swingexamples;

import javax.swing.*;

public class SwingExToDemonstrateHowToCreateJSlider extends JFrame {
    public SwingExToDemonstrateHowToCreateJSlider() {
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
    }

    public static void main(String[] args) {
        SwingExToDemonstrateHowToCreateJSlider frame = new SwingExToDemonstrateHowToCreateJSlider();
        frame.pack();
        frame.setVisible(true);
    }
}
