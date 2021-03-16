//Java Runtime Polymorphism with Multilevel Inheritance.

package src.com.mkpits.java.runtimepolymorphism;

class AnimalPolymorphismEx5 {
    void eat() {
        System.out.println("eating");
    }
}

class DogPolymorphismEx5 extends AnimalPolymorphismEx5 {
    void eat() {
        System.out.println("eating fruits");
    }
}

class BabyDogPolymorphismEx5 extends DogPolymorphismEx5 {
    void eat() {
        System.out.println("drinking milk");
    }

    public static void main(String[] args) {
        AnimalPolymorphismEx5 a1, a2, a3;
        a1 = new AnimalPolymorphismEx5();
        a2 = new DogPolymorphismEx5();
        a3 = new BabyDogPolymorphismEx5();
        a1.eat();
        a2.eat();
        a3.eat();
    }
}
