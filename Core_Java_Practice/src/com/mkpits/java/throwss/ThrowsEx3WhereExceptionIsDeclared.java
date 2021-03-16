//Java program to demonstrate the case where the exception is declared and
//exception does not occur.
//In case you declare the exception, if exception does not occur, the code will be executed fine.

package src.com.mkpits.java.throwss;

import java.io.*;

class ThrowsEx3 {
    void method() throws IOException {
        System.out.println("device operation performed");
    }
}

public class ThrowsEx3WhereExceptionIsDeclared {
    public static void main(String[] args) throws IOException {//declare exception
        ThrowsEx3 m = new ThrowsEx3();
        m.method();

        System.out.println("normal flow...");
    }
}
