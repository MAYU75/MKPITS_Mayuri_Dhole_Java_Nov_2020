//Java program Example to demonstrate the use of abstract class and interface both in a program.

//Creating interface that has 4 methods
interface AEx11 {
    void a();//by default, public and abstract
    void b();
    void c();
    void d();
}

//Creating abstract class that provides the implementation of one method of A interface
abstract class BEx11 implements AEx11 {
    public void c() {
		System.out.println("I am C");
	}
}

//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods
class MEx11 extends BEx11 {
    public void a() {
		System.out.println("I am a");
	}
    public void b() {
		System.out.println("I am b");
	}
    public void d() {
		System.out.println("I am d");
	}
}

//Creating a test class that calls the methods of A interface
class InterfaceEx11 {
    public static void main(String args[]) {
    	AEx11 a=new MEx11();
    	a.a();
    	a.b();
    	a.c();
    	a.d();
    }
}
