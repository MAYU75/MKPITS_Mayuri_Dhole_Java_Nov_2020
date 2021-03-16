//Java program example for implementing super keyword for invoking parent class constructor (explicitly)
//super is used to invoke parent class constructor.

package src.com.mkpits.java.superkeyword;

class AnimalSuperEx5 {
    AnimalSuperEx5() {
        System.out.println("animal is created");
    }
}

class DogSuperEx5 extends AnimalSuperEx5 {
    DogSuperEx5() {
        super();
        System.out.println("dog is created");
    }
}

class SuperEx5 {
    public static void main(String[] args) {
        DogSuperEx5 d = new DogSuperEx5();
    }
}
