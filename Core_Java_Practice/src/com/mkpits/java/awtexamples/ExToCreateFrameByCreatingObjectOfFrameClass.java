//Java program to demonstrate creating a frame by creating the object of Frame class (association).
package src.com.mkpits.java.awtexamples;

import java.awt.*;

public class ExToCreateFrameByCreatingObjectOfFrameClass {
    ExToCreateFrameByCreatingObjectOfFrameClass() {
        Frame f = new Frame();

        Button b = new Button("click me");
        b.setBounds(75, 75, 80, 40);

        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        ExToCreateFrameByCreatingObjectOfFrameClass f = new ExToCreateFrameByCreatingObjectOfFrameClass();
    }

}
