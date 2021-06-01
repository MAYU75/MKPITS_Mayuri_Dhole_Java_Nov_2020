//Java program to traverse elements in descending order using TreeSet.

package src.com.mkpits.java.treeset;

import java.util.*;

public class TreeSetExToTraverseElementsInDescendingOrder {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ajay");
        System.out.println("Traversing element through Iterator in descending order");
        Iterator i = set.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }

}
