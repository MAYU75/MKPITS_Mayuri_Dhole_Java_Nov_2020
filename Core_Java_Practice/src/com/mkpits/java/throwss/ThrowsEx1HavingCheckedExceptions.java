//Java program to demonstrate throws clause having checked exceptions.

package src.com.mkpits.java.throwss;
import java.io.IOException;

class ThrowsEx1HavingCheckedExceptions {
    void m() throws IOException {
        throw new IOException("device error");//checked exception
    }

    void n() throws IOException {
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
        ThrowsEx1HavingCheckedExceptions obj = new ThrowsEx1HavingCheckedExceptions();
        obj.p();
        System.out.println("normal flow...");
    }
}
