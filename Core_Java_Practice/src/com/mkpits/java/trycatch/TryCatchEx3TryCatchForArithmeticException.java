//Java program to demonstrate how Arithmetic Exception is handled using try-catch block.
//In this program, we also kept the code in a try block that will not throw an exception.

public class TryCatchEx3TryCatchForArithmeticException {

    public static void main(String[] args) {
        try {
            int data = 50 / 0; //may throw exception
            // if exception occurs, the remaining statement will not execute
            System.out.println("rest of the code");
        }
        // handling the exception
        catch (ArithmeticException e) {
            System.out.println(e);
        }

    }

}
