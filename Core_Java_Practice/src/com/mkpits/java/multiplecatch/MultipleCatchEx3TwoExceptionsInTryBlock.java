package src.com.mkpits.java.multiplecatch;

//Java program to demonstrate multi-catch block (Example 3).
// Try block contains two exceptions.
// But at a time only one exception occurs and its corresponding catch block is invoked.

public class MultipleCatchEx3TwoExceptionsInTryBlock {

    public static void main(String[] args) {

        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
            System.out.println(a[10]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}
