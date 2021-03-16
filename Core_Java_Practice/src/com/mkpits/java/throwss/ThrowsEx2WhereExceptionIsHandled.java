//Java program that demonstrate how the exception is handled using try-catch
// when a method that declares an exception is called.

package src.com.mkpits.java.throwss;

import java.io.*;

class ThrowsEx2 {
    void method() throws IOException {
        throw new IOException("device error");
    }
}

public class ThrowsEx2WhereExceptionIsHandled {
    public static void main(String[] args) {
        try {
            ThrowsEx2 m = new ThrowsEx2();
            m.method();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
        System.out.println("normal flow...");
    }
}
