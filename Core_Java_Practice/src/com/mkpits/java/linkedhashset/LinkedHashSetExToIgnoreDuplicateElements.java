//Java program to ignore duplicate elements using  LinkedHashSet.

package src.com.mkpits.java.linkedhashset;

import java.util.*;

public class LinkedHashSetExToIgnoreDuplicateElements {
    public static void main(String[] args) {
        LinkedHashSet<String> al = new LinkedHashSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
