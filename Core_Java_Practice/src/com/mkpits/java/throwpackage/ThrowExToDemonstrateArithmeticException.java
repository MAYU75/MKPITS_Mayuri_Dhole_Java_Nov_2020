//Java program to demonstrate ArithmeticException using throw keyword.

package src.com.mkpits.java.throwpackage;

public class ThrowExToDemonstrateArithmeticException {
    static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String[] args) {
        try {
            validate(13);
        } catch (ArithmeticException ee) {
            System.out.println(ee.toString());
        }
        System.out.println("rest of the code...");
    }
}
