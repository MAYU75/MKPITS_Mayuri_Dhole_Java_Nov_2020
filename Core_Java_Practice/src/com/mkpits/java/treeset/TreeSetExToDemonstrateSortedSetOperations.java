//Java program to demonstrate various SortedSet operations using TreeSet.

package src.com.mkpits.java.treeset;

import java.util.*;

public class TreeSetExToDemonstrateSortedSetOperations {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");

        System.out.println("Intial Set: " + set);

        System.out.println("Head Set: " + set.headSet("C"));

        System.out.println("SubSet: " + set.subSet("A", "E"));

        System.out.println("TailSet: " + set.tailSet("C"));
    }
}
