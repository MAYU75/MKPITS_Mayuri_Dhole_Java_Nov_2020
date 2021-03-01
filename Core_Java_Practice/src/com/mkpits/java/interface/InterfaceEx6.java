//Java program to demonstrate Multiple inheritance by interface.
//In the below example, Printable and Showable interface have
//same methods but its implementation is provided by class InterfaceEx6,
//so there is no ambiguity.

interface Printable {
    void print();
}

interface Showable {
    void print();
}

class InterfaceEx6 implements Printable, Showable {
    public void print() {
		System.out.println("Hello");
	}
    public static void main(String args[]) {
    	InterfaceEx6 obj = new InterfaceEx6();
    	obj.print();
    }
}
