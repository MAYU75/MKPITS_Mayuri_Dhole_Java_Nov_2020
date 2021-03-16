//Java program to accept name(string) using Console.Readline method.

package src.com.mkpits.java.filehandling;

import java.io.Console;

class ConsoleReadlineMethodExToAcceptName {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter your name: ");
        String n = c.readLine();
        System.out.println("Welcome " + n);
    }
}
