//Java program example for implementing super keyword.
//super is used to refer immediate parent class instance variable.

package src.com.mkpits.java.superkeyword;

class AnimalSuperEx2 {
    String color = "white";
}

class DogSuperEx2 extends AnimalSuperEx2 {
    String color = "black";

    void printColor() {
        System.out.println(super.color);//prints color of Animal class
    }
}

class BabyDogSuperEx2 extends DogSuperEx2 {
    String color = "brown";

    void printColor1() {
        System.out.println(color);//prints color of BabyDog class
        System.out.println(super.color);//prints color of Dog class
        printColor();
    }
}

class SuperEx2 {
    public static void main(String[] args) {
        BabyDogSuperEx2 d = new BabyDogSuperEx2();
        d.printColor1();
    }
}
