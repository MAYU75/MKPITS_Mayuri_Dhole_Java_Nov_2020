//Java program to demonstrate creating a frame by extending Frame class (Inheritance).

package src.com.mkpits.java.awtexamples;

import java.awt.*;

public class ExToCreateAFrameByExtendingFrameClass extends Frame {
    ExToCreateAFrameByExtendingFrameClass() {
        Button b = new Button("click me");
        b.setBounds(50, 150, 80, 30);// setting button position

        add(b);//adding button into frame
        setSize(300, 300);//frame size 300 width and 300 height
        setLayout(null);//no layout manager
        setVisible(true);//now frame will be visible, by default not visible
    }

    public static void main(String[] args) {
        ExToCreateAFrameByExtendingFrameClass f = new ExToCreateAFrameByExtendingFrameClass();
    }

}
