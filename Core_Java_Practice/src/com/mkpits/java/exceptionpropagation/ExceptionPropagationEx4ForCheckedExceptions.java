//Java Program to demonstrate Exception Propagation for checked exceptions.
//Program which describes that checked exceptions are not propagated


class ExceptionPropagationEx4ForCheckedException {
    void m() {
        try {
            throw new java.io.IOException("device error");//checked exception
        } catch (Exception ee) {
            System.out.println(ee);
        }
    }

    void n() {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handeled");
        }
    }

    public static void main(String[] args) {
        ExceptionPropagationEx4ForCheckedException obj = new ExceptionPropagationEx4ForCheckedException();
        obj.p();
        System.out.println("normal flow");
    }
}

