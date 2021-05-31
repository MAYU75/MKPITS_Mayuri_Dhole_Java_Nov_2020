//Java program to traverse the element in a backward and forward direction
//using ListIterator Interface.

package src.com.mkpits.java.list;

import java.util.*;

public class ListExToTraverseElementInBackwardAndForwardDirectionUsingListIterator {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("Amit");
        al.add("Vijay");
        al.add("Kumar");
        al.add(1, "Sachin");
        ListIterator<String> itr = al.listIterator();
        System.out.println("Traversing elements in forward direction");
        while (itr.hasNext()) {

            System.out.println("index:" + itr.nextIndex() + " value:" + itr.next());
        }
        System.out.println("Traversing elements in backward direction");
        while (itr.hasPrevious()) {

            System.out.println("index:" + itr.previousIndex() + " value:" + itr.previous());
        }
    }
}
