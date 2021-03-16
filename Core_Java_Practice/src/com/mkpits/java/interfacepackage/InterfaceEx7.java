//Java program to demonstrate Interface inheritance.
//A class implements an interface, but one interface extends another interface.

interface PrintableEx7 {
    void print();
}

interface ShowableEx7 extends PrintableEx7 {
    void show();
}

class InterfaceEx7 implements ShowableEx7 {
    public void print() {
		System.out.println("Hello");
	}
    public void show() {
		System.out.println("Welcome");
	}
    public static void main(String args[]) {
    	InterfaceEx7 obj = new InterfaceEx7();
    	obj.print();
    	obj.show();
    }
}
