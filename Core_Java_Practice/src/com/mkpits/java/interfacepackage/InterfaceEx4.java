//Java Interface Example: Bank
//Java program to demonstrate java interface which provides the implementation of Bank interface.

package src.com.mkpits.java.interfacepackage;

interface BankInterfaceEx4 {
    float rateOfInterest();
}

class SBIInterfaceEx4 implements BankInterfaceEx4 {
    public float rateOfInterest() {
        return 9.15f;
    }
}

class PNBInterfaceEx4 implements BankInterfaceEx4 {
    public float rateOfInterest() {
        return 9.7f;
    }
}

class InterfaceEx4 {
    public static void main(String[] args) {
        BankInterfaceEx4 b = new SBIInterfaceEx4();
        System.out.println("ROI: " + b.rateOfInterest());
    }
}
