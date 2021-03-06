//Java program that demonstrate how StringTokenizer class tokenizes a string.

import java.util.StringTokenizer;

public class StringTokenizerEx1ToTokenizeString {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("my .name .is .mayuri", ".");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
