package src.com.mkpits.java.filehandling;

//Java program to read data from the file using FileReader class.

import java.io.FileReader;

public class FileReaderExToReadDataFromTextFile {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("E:\\File1.txt");
        int i;
        while ((i = fr.read()) != -1)
            System.out.print((char) i);
        fr.close();
    }
}
