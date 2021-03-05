//Java program to demonstrate String class method String replace(CharSequence old, CharSequence new).
//This method replaces all occurrences of the specified CharSequence.

import java.util.*;

class StringEx12ReplaceMethod {
    public static void main(String args[]) {
        String fname = "Mayorp Dhole";

        String fullname = fname.replace("orp", "uri");
        System.out.println(fullname);

    }
}
