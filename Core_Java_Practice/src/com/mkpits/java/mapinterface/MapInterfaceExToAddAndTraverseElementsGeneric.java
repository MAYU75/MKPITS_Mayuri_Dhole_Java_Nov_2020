//Java program to add and traverse elements in map by Generic style.

package src.com.mkpits.java.mapinterface;

import java.util.*;

public class MapInterfaceExToAddAndTraverseElementsGeneric {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        //Elements can traverse in any order
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
