//Java program to demonstrate event handling by Outer class.

package src.com.mkpits.java.awtexamples;

import java.awt.*;
import java.awt.event.*;

public class ExOfEventHandlingByOuterClass extends Frame {
    TextField tf;

    ExOfEventHandlingByOuterClass() {

        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);

        Button b = new Button("click me");
        b.setBounds(100, 120, 80, 30);

        Outer o = new Outer(this);
        b.addActionListener(o);//passing outer class instance

        add(b);
        add(tf);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ExOfEventHandlingByOuterClass();
    }
}

class Outer implements ActionListener {
    ExOfEventHandlingByOuterClass obj;

    Outer(ExOfEventHandlingByOuterClass obj) {
        this.obj = obj;
    }

    public void actionPerformed(ActionEvent e) {
        obj.tf.setText("welcome Mayuri");
    }

}
