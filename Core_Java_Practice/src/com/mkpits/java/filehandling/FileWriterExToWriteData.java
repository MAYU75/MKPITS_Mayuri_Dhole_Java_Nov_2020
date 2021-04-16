package src.com.mkpits.java.filehandling;

//Java program for writing some string in the file File1.txt using Java FileWriter class.

import java.io.FileWriter;

public class FileWriterExToWriteData {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("E:\\File1.txt");
            fw.write("Welcome to mkpits.");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }
}
