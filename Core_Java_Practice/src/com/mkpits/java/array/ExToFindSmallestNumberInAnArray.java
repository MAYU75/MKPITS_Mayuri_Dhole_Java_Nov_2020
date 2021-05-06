//Java program to Find Smallest Number in an Array.

package src.com.mkpits.java.array;

public class ExToFindSmallestNumberInAnArray {
    public static int getSmallest(int[] a, int total) {
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
        return a[0];
    }

    public static void main(String args[]) {
        int a[] = {1, 2, 5, 6, 3, 2};
        System.out.println("Smallest: " + getSmallest(a, 6));
    }
}
