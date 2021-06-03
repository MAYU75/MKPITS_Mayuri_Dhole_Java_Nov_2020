//Java program to demonstrate storing duplicate key in HashMap.
//If you try to store duplicate key with another value, it will replace the value.

package src.com.mkpits.java.hashmap;

import java.util.*;

public class HashMapExToDemonstrateStoringDuplicateKey {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();//Creating HashMap
        map.put(1, "Mango");  //Put elements in Map
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(1, "Grapes"); //trying duplicate key

        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
