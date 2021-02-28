//Java Interface Example: Bank
//Java program to demonstrate java interface which provides the implementation of Bank interface.

interface Bank {
    float rateOfInterest();
}

class SBI implements Bank {
    public float rateOfInterest() {
		return 9.15f;
	}
}

class PNB implements Bank {
    public float rateOfInterest() {
		return 9.7f;
	}
}

class InterfaceEx4 {
    public static void main(String[] args) {
    	Bank b=new SBI();
    	System.out.println("ROI: "+b.rateOfInterest());
    }
}
