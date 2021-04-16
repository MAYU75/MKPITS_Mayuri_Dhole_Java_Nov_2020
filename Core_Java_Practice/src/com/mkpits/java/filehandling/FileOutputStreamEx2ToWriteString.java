package src.com.mkpits.java.filehandling;

//Java program to create a file and write some string into it using FileOutputStream class.

import java.io.FileOutputStream;

public class FileOutputStreamEx2ToWriteString {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("E:\\myfile1.txt");
            String s = "Hello. How are you?";
            byte b[] = s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
