//Java pattern program to demonstrate number pattern for Diamond pattern.

//              1
//             212
//            32123
//           4321234
//            32123
//             212
//              1

package src.com.mkpits.java.pattern;

public class NumberPatternEx4DiamondPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            int n = 4;

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
        for (int i = 3; i >= 1; i--) {
            int n = 3;

            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }

            System.out.println();
        }

    }

}
