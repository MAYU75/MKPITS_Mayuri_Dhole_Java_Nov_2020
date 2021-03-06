//Java program to demonstrate String class method String[] split(String regex, int limit).
//This method returns a split string matching regex and limit.


import java.util.*;

class StringEx15SplitMethod {
    public static void main(String[] args) {
        String fname = "mayuri,ekta,swati";
        String[] arr = fname.split(",", 2);
        for (String s : arr)
            System.out.println(s);

    }
}
