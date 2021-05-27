//Java program to demonstrate Collection of name of five students accepted from user
// using ArrayList.

package src.com.mkpits.java.arraylist;

import java.util.ArrayList;
import java.util.*;

public class ArrayListExToDemonstrateCollectionOfFiveStudentsByAcceptingFromUser {
    public static void main(String[] args) {
        ArrayList<String> stud = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("enter student name");
            String sn = sc.next();
            stud.add(sn);
        }
        System.out.println(stud);


    }

}
