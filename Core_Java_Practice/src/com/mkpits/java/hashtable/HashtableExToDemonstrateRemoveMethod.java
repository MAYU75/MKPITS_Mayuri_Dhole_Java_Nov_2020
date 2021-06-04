//Java program to demonstrate remove() method of Hashtable class.

package src.com.mkpits.java.hashtable;

import java.util.*;

public class HashtableExToDemonstrateRemoveMethod {
    public static void main(String[] args) {
        Hashtable<Integer, String> map = new Hashtable<Integer, String>();
        map.put(100, "Amit");
        map.put(102, "Ravi");
        map.put(101, "Vijay");
        map.put(103, "Rahul");
        System.out.println("Before remove: " + map);
        // Remove value for key 102
        map.remove(102);
        System.out.println("After remove: " + map);
    }
}
