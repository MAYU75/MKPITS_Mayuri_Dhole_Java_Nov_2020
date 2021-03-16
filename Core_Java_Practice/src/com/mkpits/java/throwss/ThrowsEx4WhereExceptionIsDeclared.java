//Java program to demonstrate the case where the exception is declared and
//exception occurs.
//In case you declare the exception if exception occures,
// an exception will be thrown at runtime because throws does not handle the exception.

package src.com.mkpits.java.throwss;

import java.io.*;

class ThrowsEx4 {
    void method() throws IOException {
        throw new IOException("device error");
    }
}

public class ThrowsEx4WhereExceptionIsDeclared {
    public static void main(String[] args) throws IOException {//declare exception
        ThrowsEx4 m = new ThrowsEx4();
        m.method();

        System.out.println("normal flow...");
    }
}
