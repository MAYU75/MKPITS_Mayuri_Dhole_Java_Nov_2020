//Java program to read single character from a file using FileInputStream class.

package src.com.mkpits.java.filehandling;

import java.io.FileInputStream;

class FileInputStreamEx1ToReadSingleCharacter {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("D:\\a.txt");
            int i = fin.read();
            System.out.print((char) i);

            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
