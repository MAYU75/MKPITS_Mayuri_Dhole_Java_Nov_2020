//Java program to demonstrate Private access modifier.
//The access level of a private modifier is only within the class.
//It cannot be accessed from outside the class.

class A {
	private int a=20;
    private void msg() {
		System.out.println("Hello " + a);
	}
    public void showmsg() {
		a=40;
		msg();
	}
}

class PrivateAccessModifierEx1 {
	public static void main(String[] arg) {
		A ex=new A();
		//ex.a=40;	Compile time error as variable a and method msg are declared Private.
		//ex.msg();
		ex.showmsg();
	}
}
