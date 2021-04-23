//Java program to demonstrate AWT Toolkit to change TitleBar Icon.

package src.com.mkpits.java.awtexamples;

import java.awt.*;

public class AwtToolkitExToChangeTitleBarIcon {
    AwtToolkitExToChangeTitleBarIcon() {
        Frame f = new Frame();
        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\a.jpeg");
        f.setIconImage(icon);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AwtToolkitExToChangeTitleBarIcon();
    }

}
