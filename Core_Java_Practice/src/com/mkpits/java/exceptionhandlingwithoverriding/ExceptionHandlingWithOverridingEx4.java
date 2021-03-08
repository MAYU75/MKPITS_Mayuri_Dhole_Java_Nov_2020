//Java program to demonstrate what happens if subclass overridden method declares no exception.

import java.io.*;

class ParentEHwithOverridingEx4 {
    void msg() throws Exception {
        System.out.println("parent");
    }
}

class ExceptionHandlingWithOverridingEx4 extends ParentEHwithOverridingEx4 {
    void msg() {
        System.out.println("child");
    }

    public static void main(String[] args) {
        ParentEHwithOverridingEx4 p = new ExceptionHandlingWithOverridingEx4();
        try {
            p.msg();
        } catch (Exception e) {
        }
    }
}
