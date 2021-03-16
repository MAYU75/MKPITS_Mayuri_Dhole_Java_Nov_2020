//Java program to write some string to a file using BufferedOutputStream class.

package src.com.mkpits.java.filehandling;

import java.io.*;

class BufferedOutputStreamEx2ToWriteSomeString {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("E:\\myfile3.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Hello. My name is Mayuri Dhole.";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }
}
