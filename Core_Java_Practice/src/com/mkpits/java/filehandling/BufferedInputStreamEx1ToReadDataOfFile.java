//Java program to read data of file using BufferedInputStream class.

import java.io.*;

public class BufferedInputStreamEx1ToReadDataOfFile {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("E:\\myfile3.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);
            }
            bin.close();
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
