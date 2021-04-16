package src.com.mkpits.java.exceptionhandlingwithoverriding;

//Java program to demonstrate what happens if the superclass method does not declare an exception.
//If the superclass method does not declare an exception,
//subclass overridden method cannot declare the checked exception but can declare unchecked exception.

import java.io.*;

class ParentEHwithOverridingEx1 {
    void msg() {
        System.out.println("parent");
    }
}

class ExceptionHandlingWithOverridingEx1 extends ParentEHwithOverridingEx1 {
    void msg() throws ArithmeticException {
        System.out.println("child");
    }

    public static void main(String[] args) {
        ParentEHwithOverridingEx1 p = new ExceptionHandlingWithOverridingEx1();
        p.msg();
    }
}
