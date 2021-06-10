//Java program to demonstrate chatting program on client side
//using socket programming, awt and timer.

package src.com.mkpits.java.clientsidesocketprogramming;

import java.util.TimerTask;
import java.io.*;
import java.net.*;

public class TimerClassClient extends TimerTask {
    ClientSideChatProgramUsingSocketTimerAndAwt ex;
    Socket s;
    //ServerSocket ss;
    StringBuilder sb;

    TimerClassClient(ClientSideChatProgramUsingSocketTimerAndAwt ex, Socket s) {
        this.ex = ex;
        //this.ss = ss;
        this.s = s;
        sb = new StringBuilder();

    }

    public void run() {
        //  System.out.println(  "timer running " + i);
        //        ex.ta.setText("timer running " + i);
        //    i = i + 1;
        try {
            DataInputStream din = new DataInputStream(s.getInputStream());
            String str = din.readUTF();
            sb.append("user1 : " + str + "\n");
            ex.ta.setText(sb.toString());

        } catch (Exception ee) {
            ex.ta.setText(ee.toString());
        }

    }
}

