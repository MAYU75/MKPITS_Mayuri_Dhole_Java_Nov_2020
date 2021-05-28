//Java program to sort ArrayList elements.

package src.com.mkpits.java.arraylist;

import java.util.ArrayList;
import java.util.*;

public class ArrayListExToSortArrayListElements {
    public static void main(String[] args) {
        ArrayList<String> stud = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("enter student name");
            String sn = sc.next();
            stud.add(sn);
        }
        Collections.sort(stud);

        for (String str : stud) {
            System.out.println("student name " + str);
        }

    }

}
