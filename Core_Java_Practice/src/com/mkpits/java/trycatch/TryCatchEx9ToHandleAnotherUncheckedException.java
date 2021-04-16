//Java program to handle another unchecked exception.

package src.com.mkpits.java.trycatch;

public class TryCatchEx9ToHandleAnotherUncheckedException {

    public static void main(String[] args) {
        try {
            int arr[] = {1, 3, 5, 7};
            System.out.println(arr[10]); //may throw exception
        }
        // handling the array exception
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }

}
