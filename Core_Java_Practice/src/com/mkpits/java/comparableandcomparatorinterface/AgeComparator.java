//Java program of Comparator interface to sort the list of elements
// using different Comparators.

package src.com.mkpits.java.comparableandcomparatorinterface;

import java.util.*;

class AgeComparator implements Comparator<StudentEx> {
    public int compare(StudentEx s1, StudentEx s2) {
        if (s1.age == s2.age)
            return 0;
        else if (s1.age > s2.age)
            return 1;
        else
            return -1;
    }
}

