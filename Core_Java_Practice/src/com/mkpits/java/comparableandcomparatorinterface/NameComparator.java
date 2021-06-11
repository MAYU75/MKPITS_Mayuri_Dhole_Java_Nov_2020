//Java program of Comparator interface to sort the list of elements
// using different Comparators.

package src.com.mkpits.java.comparableandcomparatorinterface;

import java.util.*;
class NameComparator implements Comparator<StudentEx>{
    public int compare(StudentEx s1,StudentEx s2){
        return s1.name.compareTo(s2.name);
    }
}

