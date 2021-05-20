//Java program of Swing to display image.

package src.com.mkpits.java.swingexamples;

import java.awt.*;
import javax.swing.JFrame;

public class SwingExToDisplayImage extends Canvas {

    public void paint(Graphics g) {

        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("D\\a.jpeg");
        g.drawImage(i, 120, 100, this);

    }

    public static void main(String[] args) {
        SwingExToDisplayImage m = new SwingExToDisplayImage();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
