//Java Program to illustrate the use of Java Method Overriding

class VehicleMethodOverridingEx3
{
	void run()
    {
		System.out.println("Vehicle is running");
    }
}

class BikeMethodOverridingEx3 extends VehicleMethodOverridingEx3
{
	void run()
	{
		System.out.println("bike is running");
	}
}

class CarMethodOverridingEx3 extends VehicleMethodOverridingEx3
{
	void run()
	{
		System.out.println("car is running");
	}
}

class MethodOverridingEx3
{
	public static void main(String args[])
    {
		//creating an instance of child class
      	BikeMethodOverridingEx3 obj = new BikeMethodOverridingEx3();
      	//calling the method with child class instance
      	obj.run();
      	CarMethodOverridingEx3 obj1 = new CarMethodOverridingEx3();
	    //calling the method with child class instance
        obj1.run();
    }
}
