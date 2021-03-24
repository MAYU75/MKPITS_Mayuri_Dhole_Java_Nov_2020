//Java program Example of Abstract class that has an abstract method.
//In this example, Bike is an abstract class
//that contains only one abstract method run.
//Its implementation is provided by the Honda class.

package src.com.mkpits.java.abstractclass;

abstract class BikeAbstractClassEx1 {
    abstract void run();
}

class ExOfAbstractClassHavingAbstractMethod extends BikeAbstractClassEx1 {
    void run() {
        System.out.println("running safely");
    }

    public static void main(String[] args) {
        BikeAbstractClassEx1 obj = new ExOfAbstractClassHavingAbstractMethod();
        obj.run();
    }
}
