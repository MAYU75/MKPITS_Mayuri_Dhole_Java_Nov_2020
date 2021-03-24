//Java Program to demonstrate the case of
//ArrayIndexOutOfBoundsException in a Java Array.

package src.com.mkpits.java.array;

class ExToDemonstrateCaseOfArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int arr[] = {50, 60, 70, 80};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
