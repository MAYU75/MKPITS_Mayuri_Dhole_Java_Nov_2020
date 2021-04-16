//Java program to simultaneous writing and reading data from a file

package src.com.mkpits.java.filehandling;

import java.io.*;
import java.util.*;

public class PrintWriterExToSimultaneouslyWriteAndReadDataFromFile {
    public static void main(String[] args) {
        try {

            //Data to write in File using PrintWriter
            PrintWriter writer1 = null;
            writer1 = new PrintWriter(new File("E:\\File8.txt"));
            writer1.write("oracle microsoft java vc.");
            writer1.flush();
            writer1.close();

            // to read data

            FileReader fr = new FileReader("E:\\File8.txt");
            int i;
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
            fr.close();


        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

}
