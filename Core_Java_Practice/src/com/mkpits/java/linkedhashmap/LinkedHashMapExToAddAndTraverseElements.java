//Java program to add and traverse elements in LinkedHashMap.

package src.com.mkpits.java.linkedhashmap;

import java.util.*;

public class LinkedHashMapExToAddAndTraverseElements {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
