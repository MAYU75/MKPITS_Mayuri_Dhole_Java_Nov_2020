//Java program Example of Abstract class that has an abstract method.
//In this example, Bike is an abstract class
//that contains only one abstract method run.
//Its implementation is provided by the Honda class.

abstract class BikeAbstractClassEx1
{
	abstract void run();
}

class HondaAbstractClassEx1 extends BikeAbstractClassEx1
{
    void run()
    {
		System.out.println("running safely");
	}
    public static void main(String args[])
    {
    	BikeAbstractClassEx1 obj = new HondaAbstractClassEx1();
     	obj.run();
    }
}
