//Java program to demonstrate creating of a calculator by extending Frame class (Inheritance).

package src.com.mkpits.java.awtexamples;

import java.awt.*;

public class ExToCreateACalculatorByExtendingFrameClass extends Frame {
    ExToCreateACalculatorByExtendingFrameClass() {
        TextField t1 = new TextField();
        t1.setBounds(10, 30, 240, 30);
        add(t1);
        Button b1 = new Button("1");
        b1.setBounds(10, 50, 80, 50);
        add(b1);
        Button b2 = new Button("2");
        b2.setBounds(90, 50, 80, 50);
        add(b2);
        Button b3 = new Button("3");
        b3.setBounds(170, 50, 80, 50);
        add(b3);
        Button b4 = new Button("4");
        b4.setBounds(10, 100, 80, 50);
        add(b4);
        Button b5 = new Button("5");
        b5.setBounds(90, 100, 80, 50);
        add(b5);
        Button b6 = new Button("6");
        b6.setBounds(170, 100, 80, 50);
        add(b6);
        Button b7 = new Button("7");
        b7.setBounds(10, 150, 80, 50);
        add(b7);
        Button b8 = new Button("8");
        b8.setBounds(90, 150, 80, 50);
        add(b8);
        Button b9 = new Button("9");
        b9.setBounds(170, 150, 80, 50);
        add(b9);
        Button b10 = new Button("0");
        b10.setBounds(10, 200, 80, 50);
        add(b10);
        Button b11 = new Button(".");
        b11.setBounds(90, 200, 80, 50);
        add(b11);
        Button b12 = new Button("=");
        b12.setBounds(170, 200, 80, 50);
        add(b12);
        Button b13 = new Button("+");
        b13.setBounds(10, 250, 80, 50);
        add(b13);
        Button b14 = new Button("-");
        b14.setBounds(90, 250, 80, 50);
        add(b14);
        Button b15 = new Button("*");
        b15.setBounds(170, 250, 80, 50);
        add(b15);
        Button b16 = new Button("/");
        b16.setBounds(10, 300, 80, 50);
        add(b16);
        Button b17 = new Button("%");
        b17.setBounds(90, 300, 80, 50);
        add(b17);
        Button b18 = new Button("<-");
        b18.setBounds(170, 300, 80, 50);
        add(b18);
        setSize(260, 350);
        setTitle("Calculator");
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        ExToCreateACalculatorByExtendingFrameClass f = new ExToCreateACalculatorByExtendingFrameClass();
    }

}
