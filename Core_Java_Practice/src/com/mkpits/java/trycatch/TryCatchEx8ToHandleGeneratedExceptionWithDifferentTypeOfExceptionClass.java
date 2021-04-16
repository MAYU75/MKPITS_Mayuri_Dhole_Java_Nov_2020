package src.com.mkpits.java.trycatch;

//Java program that demonstrate how to handle the generated exception (Arithmetic Exception)
//with a different type of exception class (ArrayIndexOutOfBoundsException).

public class TryCatchEx8ToHandleGeneratedExceptionWithDifferentTypeOfExceptionClass {

    public static void main(String[] args) {
        try {
            int data = 50 / 0; //may throw exception

        }
        // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }

}
