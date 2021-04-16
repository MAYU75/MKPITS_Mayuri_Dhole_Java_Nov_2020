//Java program to handle checked exception.

package src.com.mkpits.java.trycatch;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatchEx10ToHandleCheckedException {

    public static void main(String[] args) {


        PrintWriter pw;
        try {
            pw = new PrintWriter("jtp.txt"); //may throw exception
            pw.println("saved");
        }
        // providing the checked exception handler
        catch (FileNotFoundException e) {

            System.out.println(e);
        }
        System.out.println("File saved successfully");
    }
}
