//Java program to demonstrate retainAll() method.

package src.com.mkpits.java.arraylist;

import java.util.*;

public class ArrayListExToDemonstrateRetainAllMethod {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Mayuri");
        al.add("Aboli");
        al.add("Sharvari");
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Emma");
        al2.add("Sharvari");
        al.retainAll(al2);
        System.out.println("iterating the elements after retaining the elements of al2");
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
