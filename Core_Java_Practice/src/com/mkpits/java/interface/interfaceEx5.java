//Java program to demonstrate Multiple inheritance by interface

interface Printable{
    void print();
}
interface Showable{
    void show();
}
class interfaceEx5 implements Printable,Showable{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String args[]){
        interfaceEx5 obj = new interfaceEx5();
        obj.print();
        obj.show();
    }
}
