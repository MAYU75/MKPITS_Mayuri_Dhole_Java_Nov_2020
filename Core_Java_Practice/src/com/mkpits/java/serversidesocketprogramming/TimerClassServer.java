//Java program to demonstrate chatting program on server side
//using socket programming, awt and timer.

package src.com.mkpits.java.serversidesocketprogramming;

import java.util.TimerTask;
import java.io.*;
import java.net.*;

public class TimerClassServer extends TimerTask {
    SeverSideChatProgramUsingSocketTimerAndAwt ex;
    Socket s;
    ServerSocket ss;
    StringBuilder sb;

    TimerClassServer(SeverSideChatProgramUsingSocketTimerAndAwt ex, ServerSocket ss, Socket s) {
        this.ex = ex;
        this.ss = ss;
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
            sb.append("user 2 : " + str + "\n");
            ex.ta.setText(sb.toString());
        } catch (Exception ee) {

        }

    }
}

