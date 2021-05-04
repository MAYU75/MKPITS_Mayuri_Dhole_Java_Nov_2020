//Java pattern program to demonstrate number pattern for Right triangle.

//  1
//  2 1
//  3 2 1
//  4 3 2 1
//  5 4 3 2 1

package src.com.mkpits.java.pattern;

import java.util.Scanner;

public class NumberPatternEx7RightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");

        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        sc.close();
    }

}
