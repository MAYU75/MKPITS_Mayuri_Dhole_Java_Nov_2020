//Java program to reverse list of elements in LinkedList.

package src.com.mkpits.java.linkedlist;

import java.util.*;

public class LinkedListExToReverseListOfElements {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Mayuri");
        ll.add("Sharvari");
        ll.add("Aboli");
        //Traversing the list of elements in reverse order
        Iterator i = ll.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }

}
