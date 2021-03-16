//Java Runtime Polymorphism Example: Animal

class AnimalPolymorphismEx3 {
    void eat() {
        System.out.println("eating...");
    }
}

class DogPolymorphismEx3 extends AnimalPolymorphismEx3 {
    void eat() {
        System.out.println("eating bread...");
    }
}

class CatPolymorphismEx3 extends AnimalPolymorphismEx3 {
    void eat() {
        System.out.println("eating rat...");
    }
}

class LionPolymorphismEx3 extends AnimalPolymorphismEx3 {
    void eat() {
        System.out.println("eating meat...");
    }
}

class PolymorphismEx3 {
    public static void main(String[] args) {

        AnimalPolymorphismEx3 a;
        a = new DogPolymorphismEx3();
        a.eat();
        a = new CatPolymorphismEx3();
        a.eat();
        a = new LionPolymorphismEx3();
        a.eat();

    }
}
