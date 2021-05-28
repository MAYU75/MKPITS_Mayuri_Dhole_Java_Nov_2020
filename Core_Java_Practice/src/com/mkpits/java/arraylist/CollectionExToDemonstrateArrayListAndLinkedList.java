//Java program to demonstrate ArrayList and LinkedList.

package src.com.mkpits.java.arraylist;

import java.util.*;

public class CollectionExToDemonstrateArrayListAndLinkedList {
    public static void main(String[] args) {

        List<String> al = new ArrayList<String>();//creating arraylist
        al.add("Mayuri");//adding object in arraylist
        al.add("Aboli");
        al.add("Rajesh");
        al.add("Ajay");

        List<String> al2 = new LinkedList<String>();//creating linkedlist
        al2.add("James");//adding object in linkedlist
        al2.add("Serena");
        al2.add("Saniya");
        al2.add("Emma");

        System.out.println("arraylist: " + al);
        System.out.println("linkedlist: " + al2);
    }

}
