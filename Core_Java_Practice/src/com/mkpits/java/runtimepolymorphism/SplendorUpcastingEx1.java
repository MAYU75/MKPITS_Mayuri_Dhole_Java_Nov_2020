//Java program to demonstrate upcasting.

class BikeUpcastingEx1
{
	void run()
	{
		System.out.println("running");
	}
}

class SplendorUpcastingEx1 extends BikeUpcastingEx1
{
	void run()
	{
		System.out.println("running safely with 60km");
	}
    public static void main(String[] args)
    {
        BikeUpcastingEx1 b = new SplendorUpcastingEx1();//upcasting
        b.run();
    }
}
