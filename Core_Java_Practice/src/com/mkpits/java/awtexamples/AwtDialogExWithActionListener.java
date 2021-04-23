//Java program to demonstrate Event Handling for AWT Dialog With ActionListener.

package src.com.mkpits.java.awtexamples;

import java.awt.*;
import java.awt.event.*;

public class AwtDialogExWithActionListener {
    private static Dialog d;

    AwtDialogExWithActionListener() {
        Frame f = new Frame();
        d = new Dialog(f, "Dialog Example", true);
        d.setLayout(new FlowLayout());
        Button b = new Button("OK");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AwtDialogExWithActionListener.d.setVisible(false);
            }
        });
        d.add(new Label("Click button to continue."));
        d.add(b);
        d.setSize(300, 300);
        d.setVisible(true);
    }

    public static void main(String[] args) {
        new AwtDialogExWithActionListener();
    }

}
