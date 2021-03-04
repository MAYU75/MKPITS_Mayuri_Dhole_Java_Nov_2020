//Java program to demonstrate Static Method in Interface.
//Since Java 8, we can have static method in interface.

interface DrawableEx9 {
    void draw();
    static int cube(int x) {
		return x*x*x;
	}
}

class RectangleEx9 implements DrawableEx9 {
    public void draw() {
		System.out.println("drawing rectangle");
	}
}

class InterfaceStaticEx9 {
    public static void main(String args[]) {
    	DrawableEx9 d=new RectangleEx9();
    	d.draw();
    	System.out.println(DrawableEx9.cube(3));
    }
}
