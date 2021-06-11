//Java program of Comparator interface to sort the list of elements
// using different Comparators.

package src.com.mkpits.java.comparableandcomparatorinterface;

import java.util.*;

public class ComparatorInterfaceExThatSortsTheListElementsUsingDifferentComparators {
    public static void main(String[] args) {
        //Creating a list of students
        ArrayList<StudentEx> al = new ArrayList<StudentEx>();
        al.add(new StudentEx(101, "Vijay", 23));
        al.add(new StudentEx(106, "Ajay", 27));
        al.add(new StudentEx(105, "Jai", 21));

        System.out.println("Sorting by Name");
        //Using NameComparator to sort the elements
        Collections.sort(al, new NameComparator());
        //Traversing the elements of list
        for (StudentEx st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

        System.out.println("sorting by Age");
        //Using AgeComparator to sort the elements
        Collections.sort(al, new AgeComparator());
        //Travering the list again
        for (StudentEx st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
