//Java program example for implementing super keyword with method.
//super can be used to invoke parent class method

package src.com.mkpits.java.superkeyword;

class AnimalSuperEx3 {
    void eat() {

        System.out.println("eating...");
    }
}

class DogSuperEx3 extends AnimalSuperEx3 {
    void eat() {

        System.out.println("eating bread...");
    }

    void bark() {

        System.out.println("barking...");
    }

    void work() {
        super.eat();
        bark();
    }
}

class SuperEx3 {
    public static void main(String[] args) {
        DogSuperEx3 d = new DogSuperEx3();
        d.work();
    }
}
