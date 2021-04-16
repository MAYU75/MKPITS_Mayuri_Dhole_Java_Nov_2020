//Java program to print integer and string value to file using PrintStream class.

package src.com.mkpits.java.filehandling;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExToPrintIntegerAndStringValue {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("E:\\File6.txt");
        PrintStream pout = new PrintStream(fout);
        pout.println(2016);
        pout.println("Hello Mayuri.");
        pout.println("Welcome to Java.");
        pout.close();
        fout.close();
        System.out.println("Success");
    }
}
