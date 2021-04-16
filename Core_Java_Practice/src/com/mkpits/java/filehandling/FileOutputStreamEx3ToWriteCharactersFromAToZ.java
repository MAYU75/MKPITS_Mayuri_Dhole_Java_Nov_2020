package src.com.mkpits.java.filehandling;

//Java program to create a file and write characters from A to Z using FileOutputStream class.

import java.io.FileOutputStream;

public class FileOutputStreamEx3ToWriteCharactersFromAToZ {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("E:\\myfile2.txt");
            int i = 1;
            for (i = 65; i <= 90; i++) {
                fout.write(i);
            }
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}