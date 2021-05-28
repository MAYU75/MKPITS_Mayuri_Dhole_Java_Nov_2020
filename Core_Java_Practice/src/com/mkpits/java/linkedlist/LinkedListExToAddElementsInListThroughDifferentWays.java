//Java program to add elements in list through different ways.

package src.com.mkpits.java.linkedlist;

import java.util.*;

public class LinkedListExToAddElementsInListThroughDifferentWays {
    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<String>();
        System.out.println("Initial list of elements: " + ll);
        ll.add("Sharvari");
        ll.add("Emma");
        ll.add("Aboli");
        System.out.println("After invoking add(E e) method: " + ll);
        //Adding an element at the specific position
        ll.add(1, "Mayuri");
        System.out.println("After invoking add(int index, E element) method: " + ll);
        LinkedList<String> ll2 = new LinkedList<String>();
        ll2.add("Saniya");
        ll2.add("James");
        //Adding second list elements to the first list
        ll.addAll(ll2);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: " + ll);
        LinkedList<String> ll3 = new LinkedList<String>();
        ll3.add("John");
        ll3.add("Jeniffer");
        //Adding second list elements to the first list at specific position
        ll.addAll(1, ll3);
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + ll);
        //Adding an element at the first position
        ll.addFirst("Loki");
        System.out.println("After invoking addFirst(E e) method: " + ll);
        //Adding an element at the last position
        ll.addLast("Harry");
        System.out.println("After invoking addLast(E e) method: " + ll);

    }

}
