//Java program that demonstrate nextToken(String delim) method of StringTokenizer class

import java.util.*;

public class StringTokenizerEx2NextTokenMethod {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("my,name,is,Mayuri");

        // printing next token
        System.out.println("Next token is : " + st.nextToken(","));
    }
}
