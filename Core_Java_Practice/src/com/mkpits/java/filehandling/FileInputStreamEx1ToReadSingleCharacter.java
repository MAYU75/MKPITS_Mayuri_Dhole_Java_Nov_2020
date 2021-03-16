//Java program to read single character from a file using FileInputStream class.

package src.com.mkpits.java.filehandling;

import java.io.FileInputStream;

class FileStreamEx1ToReadSingleCharacter {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("E:\\myfile1.txt");
            int i = fin.read();
            System.out.print((char) i);

            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
