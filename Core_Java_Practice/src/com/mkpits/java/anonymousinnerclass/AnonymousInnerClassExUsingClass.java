//Java program Example for anonymous inner class using class.

package src.com.mkpits.java.anonymousinnerclass;

abstract class PersonAnonymousInnerClassEx1 {
    abstract void eat();
}

class AnonymousInnerClassExUsingClass {
    public static void main(String[] args) {
        PersonAnonymousInnerClassEx1 p = new PersonAnonymousInnerClassEx1() {
            void eat() {
                System.out.println("nice fruits");
            }
        };
        p.eat();
    }
}
