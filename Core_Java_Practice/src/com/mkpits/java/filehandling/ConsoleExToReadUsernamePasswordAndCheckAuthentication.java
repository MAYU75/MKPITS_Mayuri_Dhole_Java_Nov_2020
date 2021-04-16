//Java program to accept username and password and print "authentication successful" if user entered
//username as admin and password as admin otherwise print "invalid credentials".

package src.com.mkpits.java.filehandling;
import java.io.*;

class ConsoleExToReadUsernamePasswordAndCheckAuthentication {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter your name: ");
        String n = c.readLine();
        System.out.println("Enter password: ");
        char[] ch = c.readPassword();
        String pass = String.valueOf(ch);//converting char array into string
        if (n.equals("Mayuri") && pass.equals("m@yu")) {
            System.out.println("Authentication Successful");
        } else {
            System.out.println("Invalid Credentials");
        }
    }
}