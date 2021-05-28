//Java program to display LinkedList using Iterator.

package src.com.mkpits.java.linkedlist;

import java.util.*;

public class LinkedListExToDisplayListUsingIterator {
    public static void main(String[] args) {

        LinkedList<String> al = new LinkedList<String>();
        al.add("Sharvari");
        al.add("Emma");
        al.add("Mayuri");
        al.add("Aboli");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
