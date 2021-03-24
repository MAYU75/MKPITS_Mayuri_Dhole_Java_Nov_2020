//Java program Example for anonymous inner class using interface.

package src.com.mkpits.java.anonymousinnerclass;

interface Eatable {
    void eat();
}

class AnonymousInnerClassExUsingInterface {
    public static void main(String[] args) {
        Eatable e = new Eatable() {
            public void eat() {
                System.out.println("nice fruits");
            }
        };
        e.eat();
    }
}
