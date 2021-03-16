//Java program example for implementing super keyword for invoking parent class constructor.(Explicitly)
//super is used to invoke parent class constructor.

package src.com.mkpits.java.superkeyword;

class AnimalSuperEx4 {
    AnimalSuperEx4() {
        System.out.println("eating...");
    }
}

class DogSuperEx4 extends AnimalSuperEx4 {
    DogSuperEx4() {
        super();
        System.out.println("eating bread...");
    }

    void bark() {
        System.out.println("barking...");
    }
}

class SuperEx4 {
    public static void main(String[] args) {
        DogSuperEx4 d = new DogSuperEx4();
        d.bark();
    }
}
