//Java program to find 2nd smallest number in an Array.

package src.com.mkpits.java.array;

public class ExToFind2ndSmallestNumberInAnArray {
    public static int getSecondSmallest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[1];//2nd element because index starts from 0
    }

    public static void main(String args[]) {
        int a[] = {44, 66, 99, 77, 33, 22, 55};
        System.out.println("Second smallest: " + getSecondSmallest(a, 7));
    }
}
