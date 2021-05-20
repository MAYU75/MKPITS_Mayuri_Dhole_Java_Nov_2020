//Java program of Swing to demonstrate how to change TitleBar icon.

package src.com.mkpits.java.swingexamples;

import java.awt.*;

public class SwingExToDemonstrateHowToChangeTitleBarIcon {
    SwingExToDemonstrateHowToChangeTitleBarIcon() {
        Frame f = new Frame();
        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\a.jpeg");
        f.setIconImage(icon);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new SwingExToDemonstrateHowToChangeTitleBarIcon();
    }
}
