//Java program to demonstrate chatting program on client side
//using socket programming, awt and timer.

package src.com.mkpits.java.clientsidesocketprogramming;

import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

public class ClientSideChatProgramUsingSocketTimerAndAwt extends Frame {
    Label l1, l2;
    TextField t1;
    Button b1, b2;
    TextArea ta;
    //ServerSocket ss;
    Socket s;
    DataOutputStream dout;
    DataInputStream din;
    StringBuilder sb;
    public static Timer timer;

    ClientSideChatProgramUsingSocketTimerAndAwt() {
        sb = new StringBuilder();
        l1 = new Label("enter some text");
        l1.setBounds(10, 50, 200, 30);
        add(l1);
        t1 = new TextField();
        t1.setBounds(220, 50, 200, 30);
        add(t1);
        b1 = new Button("recieve");
        b1.setBounds(100, 100, 200, 30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Timer timer = new Timer();
                    TimerTask task = new TimerClassClient(new ClientSideChatProgramUsingSocketTimerAndAwt(), s);
                    timer.schedule(task, 1000, 5000);

                } catch (Exception ee) {
                    ta.setText(ee.toString());
                }
            }
        });
        add(b1);
        b2 = new Button("send");
        b2.setBounds(320, 100, 200, 30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    dout = new DataOutputStream(s.getOutputStream());
                    String str = t1.getText();
                    dout.writeUTF(str);
                    //    ta.setText("message sent");
                    dout.flush();

                } catch (Exception ee) {
                    ta.setText(ee.toString());
                }

            }
        });
        add(b2);
        ta = new TextArea();
        ta.setBounds(50, 150, 500, 200);
        add(ta);

        setLayout(null);
        setTitle("client");
        setSize(600, 500);
        setVisible(true);
        try {
            s = new Socket("localhost", 6666);

        } catch (Exception ee) {
            System.out.println(ee.toString());
        }
    }

    public static void main(String[] args) {
        ClientSideChatProgramUsingSocketTimerAndAwt an = new ClientSideChatProgramUsingSocketTimerAndAwt();
    }
}


