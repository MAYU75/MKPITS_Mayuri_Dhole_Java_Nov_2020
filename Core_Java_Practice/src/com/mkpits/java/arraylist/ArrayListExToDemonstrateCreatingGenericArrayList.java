//Java program to demonstrate how to create a generic ArrayList.

package src.com.mkpits.java.arraylist;

import java.util.*;

public class ArrayListExToDemonstrateCreatingGenericArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Printing the arraylist object
        System.out.println(list);
    }

}
