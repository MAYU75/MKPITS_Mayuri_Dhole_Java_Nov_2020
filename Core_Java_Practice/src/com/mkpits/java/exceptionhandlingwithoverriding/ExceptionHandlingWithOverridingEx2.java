//Java program to demonstrate what happens if subclass overridden method declares same exception.

import java.io.*;

class ParentEHwithOverridingEx2 {
    void msg() throws Exception {
        System.out.println("parent");
    }
}

class ExceptionHandlingWithOverridingEx2 extends ParentEHwithOverridingEx2 {
    void msg() throws Exception {
        System.out.println("child");
    }

    public static void main(String[] args) {
        ParentEHwithOverridingEx2 p = new ExceptionHandlingWithOverridingEx2();
        try {
            p.msg();
        } catch (Exception e) {
        }
    }
}
