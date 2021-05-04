//Java program to demonstrate how to handle Keyboard event with Adapter Class.

package src.com.mkpits.java.awtexamples;

import java.awt.*;
import java.awt.event.*;

public class AdapterClassExForKeyboardEvent extends Frame {
    TextField tf;

    public AdapterClassExForKeyboardEvent() {
        Label l = new Label("enter characters");
        l.setBounds(10, 30, 100, 30);
        add(l);
        tf = new TextField(20);

        tf.setBounds(120, 30, 100, 30);
        //tf.addKeyListener(new mykeyadapter(this));
        add(tf);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        AdapterClassExForKeyboardEvent ad = new AdapterClassExForKeyboardEvent();
    }
}

class mykeyadapter extends AdapterClassExForKeyboardEvent {
    AdapterClassExForKeyboardEvent adapterdemo;

    public mykeyadapter(AdapterClassExForKeyboardEvent adapterdemo) {
        this.adapterdemo = adapterdemo;
    }

    public void keyTyped(KeyEvent e) {
        System.out.println(" clicked");
    }

}
