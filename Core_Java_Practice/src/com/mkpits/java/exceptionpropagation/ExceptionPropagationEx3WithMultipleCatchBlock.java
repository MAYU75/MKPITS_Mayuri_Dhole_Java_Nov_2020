package src.com.mkpits.java.exceptionpropagation;

//Java Program to demonstrate Exception Propagation with Multiple Catch Block (Example 2).
//Exception can be handled in any method in call stack either in main() method,p() method,n() method or m() method.

public class ExceptionPropagationEx3WithMultipleCatchBlock {

    void m() {
        try {
            int data = 50 / 0;
        } catch (Exception ee) {
            System.out.println("exception handled in method m");
        }
    }

    void n() {
        m();
    }

    void p() {

        n();

    }

    public static void main(String[] args) {
        ExceptionPropagationEx3WithMultipleCatchBlock obj = new ExceptionPropagationEx3WithMultipleCatchBlock();
        try {
            obj.p();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
        System.out.println("normal flow...");
    }
}
