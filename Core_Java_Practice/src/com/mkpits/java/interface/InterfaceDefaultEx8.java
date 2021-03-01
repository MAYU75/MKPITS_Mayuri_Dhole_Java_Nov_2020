//Java program to demonstrate Default Method in Interface.
//Since Java 8, we can have method body in interface.
//But we need to make it default method.

interface Drawable {
    void draw();
    default void msg() {
		System.out.println("default method");
	}
}

class Rectangle implements Drawable {
    public void draw() {
		System.out.println("drawing rectangle");
	}
}

class InterfaceDefaultEx8 {
    public static void main(String args[]) {
    	Drawable d=new Rectangle();
    	d.draw();
    	d.msg();
    }
}
