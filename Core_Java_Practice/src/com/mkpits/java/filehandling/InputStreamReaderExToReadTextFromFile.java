//Java program to read text from file using InputStreamReader class.

import java.io.*;

public class InputStreamReaderExToReadTextFromFile {
    public static void main(String[] args) {
        try {
            InputStream stream = new FileInputStream("E:\\File1.txt");
            Reader reader = new InputStreamReader(stream);
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
