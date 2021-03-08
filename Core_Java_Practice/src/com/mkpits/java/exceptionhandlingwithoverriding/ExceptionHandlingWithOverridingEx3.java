//Java program to demonstrate what happens if subclass overridden method declares subclass exception.

import java.io.*;

class ParentEHwithOverridingEx3 {
    void msg() throws Exception {
        System.out.println("parent");
    }
}

class ExceptionHandlingWithOverridingEx3 extends ParentEHwithOverridingEx3 {
    void msg() throws ArithmeticException {
        System.out.println("child");
    }

    public static void main(String[] args) {
        ParentEHwithOverridingEx3 p = new ExceptionHandlingWithOverridingEx3();
        try {
            p.msg();
        } catch (Exception e) {
        }
    }
}
