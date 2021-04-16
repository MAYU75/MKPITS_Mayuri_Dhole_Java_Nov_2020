package src.com.mkpits.java.trycatch;

//Java program to demonstrate how Arithmetic Exception is handled using try-catch block.

public class TryCatchEx2TryCatchForArithmeticException {

    public static void main(String[] args) {
        try {
            int data = 50 / 0; //may throw exception
        }
        //handling the exception
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }

}
