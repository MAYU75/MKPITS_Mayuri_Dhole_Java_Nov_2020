//Java program to demonstrate how to send messages to client from server
// and receive messages from client.

package src.com.mkpits.java.serversidesocketprogramming;

import java.net.*;
import java.io.*;

public class ServerExToSendAndReceiveMessagesFromClient {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(3333);
            System.out.println("server ready to accept connection");
            Socket s = ss.accept();

            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = "";
            String str2 = "";
            while (!str.equals("stop")) {
                str = din.readUTF();
                System.out.println("client says: " + str);
                System.out.println("enter some message:");
                str2 = br.readLine();
                dout.writeUTF(str2);
                dout.flush();

            }
            //dout.close();
            din.close();
            s.close();
            ss.close();
        } catch (Exception ee) {
            System.out.println(ee.toString());
        }
    }
}
