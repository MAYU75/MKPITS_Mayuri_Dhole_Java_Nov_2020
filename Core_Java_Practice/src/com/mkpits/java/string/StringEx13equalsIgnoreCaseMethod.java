//Java program to demonstrate String class method static String equalsIgnoreCase(String another).
//This method compares another string. It doesn't check case.

import java.util.*;

class StringEx13equalsIgnoreCaseMethod {
    public static void main(String[] args) {
        String fname = "mayori";
        String lname = "Mayuri";
//String equalsIgnoreCase(String another)
        boolean s = lname.equalsIgnoreCase(fname);
        System.out.println(s);

    }
}
