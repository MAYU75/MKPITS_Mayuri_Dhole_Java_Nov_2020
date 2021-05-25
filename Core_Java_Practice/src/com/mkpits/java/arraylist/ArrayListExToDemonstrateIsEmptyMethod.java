//Java program to demonstrate isEmpty() method.

package src.com.mkpits.java.arraylist;

import java.util.*;

public class ArrayListExToDemonstrateIsEmptyMethod {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Is ArrayList Empty: " + al.isEmpty());
        al.add("Mayuri");
        al.add("Sharvari");
        al.add("Aboli");
        System.out.println("After Insertion");
        System.out.println("Is ArrayList Empty: " + al.isEmpty());
    }

}
