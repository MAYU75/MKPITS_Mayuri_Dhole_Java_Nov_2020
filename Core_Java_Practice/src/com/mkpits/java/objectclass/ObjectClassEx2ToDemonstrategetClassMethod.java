//Java program to demonstrate getClass() method of Object class.

import java.lang.*;
class ObjectClassEx2parent
{

}
class ObjectClassEx2ToDemonstrategetClassMethod extends ObjectClassEx2parent
{
    public static void main(String[] args) {
        ObjectClassEx2parent t=new ObjectClassEx2ToDemonstrategetClassMethod();
        Object obj=t.getClass();
        System.out.println("obj = " + obj);
    }
}
