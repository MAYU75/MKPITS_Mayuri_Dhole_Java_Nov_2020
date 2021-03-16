//Java program Example of super keyword where super() is provided by the compiler implicitly.
//super is used to invoke parent class constructor.

package src.com.mkpits.java.superkeyword;

class AnimalSuperEx6 {
    AnimalSuperEx6() {
        System.out.println("animal is created");
    }
}

class DogSuperEx6 extends AnimalSuperEx6 {
    DogSuperEx6() {
        //super(); Implicitly invoked.
        System.out.println("dog is created");
    }
}

class SuperEx6 {
    public static void main(String[] args) {

        DogSuperEx6 d = new DogSuperEx6();
    }
}
