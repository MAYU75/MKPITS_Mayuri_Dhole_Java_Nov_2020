//Java program to demonstrate how to add Checkbox in Frame.

package src.com.mkpits.java.awtexamples;

import java.awt.*;

public class ExToDemonstrateHowToAddCheckboxInFrame {
    ExToDemonstrateHowToAddCheckboxInFrame() {
        Frame f = new Frame("Checkbox Example");
        Checkbox checkbox1 = new Checkbox("C++");
        checkbox1.setBounds(100, 100, 50, 50);
        Checkbox checkbox2 = new Checkbox("Java", true);
        checkbox2.setBounds(100, 150, 50, 50);
        f.add(checkbox1);
        f.add(checkbox2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ExToDemonstrateHowToAddCheckboxInFrame();
    }

}
