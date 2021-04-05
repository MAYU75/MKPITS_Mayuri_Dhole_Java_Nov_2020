//Java program to demonstrate how to add TextArea in Frame.

package src.com.mkpits.java.awtexamples;

import java.awt.*;

public class ExToDemonstrateHowToAddTextAreaInFrame {
    ExToDemonstrateHowToAddTextAreaInFrame() {
        Frame f = new Frame();
        TextArea area = new TextArea("Hello. Welcome to Java programming.");
        area.setBounds(10, 30, 300, 300);
        f.add(area);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ExToDemonstrateHowToAddTextAreaInFrame();
    }

}
