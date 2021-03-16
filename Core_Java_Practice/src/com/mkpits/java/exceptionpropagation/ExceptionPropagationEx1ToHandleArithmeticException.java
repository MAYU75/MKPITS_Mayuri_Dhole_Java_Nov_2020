//Java Program for Exception Propagation that handles Arithmetic Exception.

class ExceptionPropagationEx1ToHandleArithmeticException {
    void m() {

        int data = 50 / 0;
    }

    void n() {

        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String[] args) {
        ExceptionPropagationEx1ToHandleArithmeticException obj = new ExceptionPropagationEx1ToHandleArithmeticException();
        obj.p();
        System.out.println("normal flow...");
    }
}
