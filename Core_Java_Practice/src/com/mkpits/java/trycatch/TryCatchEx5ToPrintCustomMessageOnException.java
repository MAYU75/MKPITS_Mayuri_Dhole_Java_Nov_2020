package src.com.mkpits.java.trycatch;

//Java program to print a custom message on exception.

public class TryCatchEx5ToPrintCustomMessageOnException {

    public static void main(String[] args) {
        try {
            int data = 50 / 0; //may throw exception
        }
        // handling the exception
        catch (Exception e) {
            // displaying the custom message
            System.out.println("Can't divide by zero");
        }
    }

}
