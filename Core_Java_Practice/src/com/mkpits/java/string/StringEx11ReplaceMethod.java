//Java program to demonstrate String class method String replace(char old, char new).
//This method replaces all occurrences of the specified char value.

import java.util.*;

class StringEx11ReplaceMethod {
    public static void main(String[] args) {
        String fname = "Mayuri";

        String fullname = fname.replace('u', 'o');
        System.out.println(fullname);

    }
}
