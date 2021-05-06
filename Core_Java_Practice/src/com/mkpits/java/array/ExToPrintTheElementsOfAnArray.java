//Java Program to print the elements of an array.

package src.com.mkpits.java.array;

public class ExToPrintTheElementsOfAnArray {
    public static void main(String[] args) {
        //Initialize array
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Elements of given array: ");
        //Loop through the array by incrementing value of i
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
