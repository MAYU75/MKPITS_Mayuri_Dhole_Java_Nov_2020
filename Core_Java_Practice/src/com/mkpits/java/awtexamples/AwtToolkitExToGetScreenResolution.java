//Java program to demonstrate AWT Toolkit to get screen resolution.

package src.com.mkpits.java.awtexamples;

import java.awt.*;

public class AwtToolkitExToGetScreenResolution {
    public static void main(String[] args) {
        Toolkit t = Toolkit.getDefaultToolkit();
        System.out.println("Screen resolution = " + t.getScreenResolution());
        Dimension d = t.getScreenSize();
        System.out.println("Screen width = " + d.width);
        System.out.println("Screen height = " + d.height);
    }
}
