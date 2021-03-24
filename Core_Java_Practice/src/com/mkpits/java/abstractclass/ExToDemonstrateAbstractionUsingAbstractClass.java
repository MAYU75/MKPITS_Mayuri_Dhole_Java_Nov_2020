//Java program Example to demonstrate Abstraction using Abstract class.

package src.com.mkpits.java.abstractclass;

abstract class Shape {
    abstract void draw();
}

//In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("drawing circle");
    }
}

//In real scenario, method is called by programmer or user
class ExToDemonstrateAbstractionUsingAbstractClass {
    public static void main(String[] args) {
        Shape s = new Circle();//In a real scenario, object is provided through method, e.g., getShape() method
        s.draw();
    }
}
