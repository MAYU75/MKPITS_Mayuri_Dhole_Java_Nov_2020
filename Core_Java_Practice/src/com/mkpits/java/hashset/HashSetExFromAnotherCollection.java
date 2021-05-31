//Java program to demonstrate Java HashSet from another Collection.

package src.com.mkpits.java.hashset;

import java.util.*;

public class HashSetExFromAnotherCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");

        HashSet<String> set = new HashSet(list);
        set.add("Gaurav");
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
