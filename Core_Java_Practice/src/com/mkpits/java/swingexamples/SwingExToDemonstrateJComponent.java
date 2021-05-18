//Java program of Swing to demonstrate JComponent.

package src.com.mkpits.java.swingexamples;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class SwingExToDemonstrateJComponent extends JComponent {
    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(30, 30, 100, 100);
    }
}

class JComponentExample {
    public static void main(String[] args) {
        SwingExToDemonstrateJComponent com = new SwingExToDemonstrateJComponent();
        // create a basic JFrame
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("JComponent Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // add the JComponent to main frame
        frame.add(com);
        frame.setVisible(true);
    }
}
