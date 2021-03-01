//Java program to demonstrate Interface inheritance.
//A class implements an interface, but one interface extends another interface.

interface Printable {
    void print();
}

interface Showable extends Printable {
    void show();
}

class InterfaceEx7 implements Showable {
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
