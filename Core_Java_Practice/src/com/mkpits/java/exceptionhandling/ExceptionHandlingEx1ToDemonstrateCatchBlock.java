//Java program to demonstrate catch block.

public class ExceptionHandlingEx1ToDemonstrateCatchBlock {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 0;
        int res = 0;
        try {
            res = n1 / n2;
        } catch (Exception ee) {
            System.out.println(ee.toString());
        }
        System.out.println("res = " + res);
    }
}
