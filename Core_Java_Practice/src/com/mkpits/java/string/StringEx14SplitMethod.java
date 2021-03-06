//Java program to demonstrate String class method String[] split(String regex).
//This method returns a split string matching regex.


import java.util.*;

class StringEx14SplitMethod {
    public static void main(String[] args) {
        String fname = "mayuri,ekta,swati";
        String[] arr = fname.split(",");
        for (String s : arr)
            System.out.println(s);

    }
}
