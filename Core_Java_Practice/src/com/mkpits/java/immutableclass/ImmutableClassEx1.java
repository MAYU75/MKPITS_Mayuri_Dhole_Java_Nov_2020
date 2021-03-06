//Java program to demonstrate Immutable Class.

final class EmployeeImmClassEx1 {
    final String pancardNumber;

    public EmployeeImmClassEx1(String pancardNumber) {
        this.pancardNumber = pancardNumber;
    }

    public String getPancardNumber() {
        return pancardNumber;
    }

}

public class ImmutableClassEx1 {
    public static void main(String[] args) {
        EmployeeImmClassEx1 e = new EmployeeImmClassEx1("abcd275");
        System.out.println("pancard no " + e.getPancardNumber());
    }
}
