//Java program that demonstrate how to handle the exception using the parent class exception.

public class TryCatchEx4HandlingExceptionUsingExceptionClass {

    public static void main(String[] args) {
        try {
            int data = 50 / 0; //may throw exception
        }
        // handling the exception by using Exception class
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }

}
