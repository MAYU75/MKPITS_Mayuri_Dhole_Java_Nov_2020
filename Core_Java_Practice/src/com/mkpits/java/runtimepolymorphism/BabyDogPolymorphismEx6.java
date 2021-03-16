//Java Runtime Polymorphism with Multilevel Inheritance.

class AnimalPolymorphismEx6 {
    void eat() {
        System.out.println("animal is eating...");
    }
}

class DogPolymorphismEx6 extends AnimalPolymorphismEx6 {
    void eat() {
        System.out.println("dog is eating...");
    }
}

class BabyDogPolymorphismEx6 extends DogPolymorphismEx6 {
    public static void main(String args[]) {
        AnimalPolymorphismEx6 a = new BabyDogPolymorphismEx6();
        a.eat();
    }
}
