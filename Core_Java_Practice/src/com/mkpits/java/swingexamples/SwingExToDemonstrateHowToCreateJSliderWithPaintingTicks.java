//Java program of Swing to demonstrate how to create JSlider with painting ticks.

package src.com.mkpits.java.swingexamples;

import javax.swing.*;

public class SwingExToDemonstrateHowToCreateJSliderWithPaintingTicks extends JFrame {
    public SwingExToDemonstrateHowToCreateJSliderWithPaintingTicks() {
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
    }

    public static void main(String[] args) {
        SwingExToDemonstrateHowToCreateJSliderWithPaintingTicks frame = new SwingExToDemonstrateHowToCreateJSliderWithPaintingTicks();
        frame.pack();
        frame.setVisible(true);
    }
}
