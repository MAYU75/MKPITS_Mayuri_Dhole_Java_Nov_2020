//Java program to demonstrate Default Method in Interface.
//Since Java 8, we can have method body in interface.
//But we need to make it default method.

interface Drawable {
    void draw();
    default void msg() {
		System.out.println("default method");
	}
}

class RectangleInterfaceDefaultEx8 implements Drawable {
    public void draw() {
		System.out.println("drawing rectangle");
	}
}

class InterfaceDefaultEx8 {
    public static void main(String args[]) {
    	Drawable d=new RectangleInterfaceDefaultEx8();
    	d.draw();
    	d.msg();
    }
}
