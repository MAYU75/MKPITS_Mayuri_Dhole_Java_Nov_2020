//Java program to retrieve and remove the highest and lowest Value using TreeSet.

package src.com.mkpits.java.treeset;

import java.util.*;

public class TreeSetExToRetrieveAndRemoveHighestAndLowestValue {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        System.out.println("Highest Value: " + set.pollFirst());
        System.out.println("Lowest Value: " + set.pollLast());
    }
}
