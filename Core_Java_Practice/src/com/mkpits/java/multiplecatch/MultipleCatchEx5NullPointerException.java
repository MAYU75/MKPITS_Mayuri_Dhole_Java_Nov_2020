//Java program to demonstrate multi-catch block having NullPointerException.
//Here NullPointerException is generated.
//But the corresponding exception type is not provided.
// In such case, the catch block containing the parent exception class Exception will invoked.

public class MultipleCatchEx5NullPointerException {

    public static void main(String[] args) {

        try {
            String s = null;
            System.out.println(s.length());
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
