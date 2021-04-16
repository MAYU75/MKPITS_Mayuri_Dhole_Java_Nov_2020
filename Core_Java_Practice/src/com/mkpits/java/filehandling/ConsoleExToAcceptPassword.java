package src.com.mkpits.java.filehandling;

//Java program to accept password using console class.

import java.io.Console;

class ConsoleExToAcceptPassword {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter password: ");
        char[] ch = c.readPassword();
        String pass = String.valueOf(ch);//converting char array into string
        System.out.println("Password is: " + pass);
    }
}
