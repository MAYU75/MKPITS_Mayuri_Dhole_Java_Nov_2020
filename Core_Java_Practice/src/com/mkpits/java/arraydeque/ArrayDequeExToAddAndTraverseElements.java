//Java program to add and traverse elements using ArrayDeque.

package src.com.mkpits.java.arraydeque;

import java.util.*;

public class ArrayDequeExToAddAndTraverseElements {
    public static void main(String[] args) {
        //Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Ravi");
        deque.add("Vijay");
        deque.add("Ajay");
        //Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }
    }
}
