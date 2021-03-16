//Java Program to demonstrate Exception Propagation with Multiple Catch Block (Example 1).
//Here exception occurs in m() method where it is not handled,
//so it is propagated to previous n() method where it is not handled,
//again it is propagated to p() method where exception is handled.

public class ExceptionPropagationEx2WithMultipleCatchBlock {

    void m() {
        int data = 50 / 0;
    }

    void n() {
        m();
    }

    void p() {

        n();

    }

    public static void main(String[] args) {
        ExceptionPropagationEx2WithMultipleCatchBlock obj = new ExceptionPropagationEx2WithMultipleCatchBlock();
        try {
            obj.p();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
        System.out.println("normal flow...");
    }
}
