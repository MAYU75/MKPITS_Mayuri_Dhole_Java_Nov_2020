//Java program to demonstrate how to remove Elements in ArrayList.

package src.com.mkpits.java.arraylist;

import java.util.*;

public class ArrayListExToDemonstrateHowToRemoveElementInArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Mayuri");
        al.add("Aboli");
        al.add("Sharvari");
        al.add("Saniya");
        al.add("Emma");
        System.out.println("An initial list of elements: " + al);
        //Removing specific element from arraylist
        al.remove("Lucy");
        System.out.println("After invoking remove(object) method: " + al);
        //Removing element on the basis of specific position
        al.remove(0);
        System.out.println("After invoking remove(index) method: " + al);

        //Creating another arraylist
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Swati");
        al2.add("Jenifer");
        //Adding new elements to arraylist
        al.addAll(al2);
        System.out.println("Updated list : " + al);
        //Removing all the new elements from arraylist
        al.removeAll(al2);
        System.out.println("After invoking removeAll() method: " + al);
        //Removing elements on the basis of specified condition
        al.removeIf(str -> str.contains("Ajay"));   //Here, we are using Lambda expression
        System.out.println("After invoking removeIf() method: " + al);
        //Removing all the elements available in the list
        al.clear();
        System.out.println("After invoking clear() method: " + al);
    }

}
