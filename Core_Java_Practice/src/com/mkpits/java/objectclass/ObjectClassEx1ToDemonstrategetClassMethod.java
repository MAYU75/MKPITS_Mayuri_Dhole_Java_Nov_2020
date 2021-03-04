//Java program to demonstrate getClass() method of Object class.

import java.lang.*;

public class ObjectClassEx1ToDemonstrategetClassMethod {
    public static void main(String[] args) {
        ObjectClassEx1ToDemonstrategetClassMethod t = new ObjectClassEx1ToDemonstrategetClassMethod();
        Object obj = t.getClass();
        System.out.println("obj = " + obj);
    }
}
