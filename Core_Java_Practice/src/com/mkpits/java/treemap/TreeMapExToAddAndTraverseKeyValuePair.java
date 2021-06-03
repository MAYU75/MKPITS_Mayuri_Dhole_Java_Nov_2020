//Java program to add and traverse Key-Value Pair using TreeMap.

package src.com.mkpits.java.treemap;

import java.util.*;

public class TreeMapExToAddAndTraverseKeyValuePair {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(100, "Amit");
        map.put(102, "Ravi");
        map.put(101, "Vijay");
        map.put(103, "Rahul");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
