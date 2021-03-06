//Java program to demonstrate String class method int indexOf(String substring, int fromIndex)
//This method returns the specified substring index starting with given index.


import java.util.*;

class StringEx17indexOfMethod {
    public static void main(String[] args) {
        String name = "mayuri,ekta,swati";
        int arr = name.indexOf("ekta", 2);

        System.out.println(arr);

    }
}
