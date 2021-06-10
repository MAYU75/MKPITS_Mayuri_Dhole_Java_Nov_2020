//Java program to demonstrate how to send messages to server from client
// and receive messages from server.

package src.com.mkpits.java.clientsidesocketprogramming;

import java.net.*;
import java.io.*;

public class ClientExToSendAndReceiveMessagesFromServer {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 3333);
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = "", str2 = "";
            while (!str.equals("stop")) {
                System.out.println("enter some message:");
                str = br.readLine();
                dout.writeUTF(str);
                dout.flush();
                str2 = din.readUTF();
                System.out.println("Server says: " + str2);
            }

            dout.close();
            s.close();

        } catch (Exception ee) {
            System.out.println(ee.toString());
        }
    }
}
