//Java program to demonstrate Multiple inheritance by interface

interface PrintableEx5{
    void print();
}
interface ShowableEx5{
    void show();
}
class InterfaceEx5 implements PrintableEx5,ShowableEx5{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String args[]){
        InterfaceEx5 obj = new InterfaceEx5();
        obj.print();
        obj.show();
    }
}
