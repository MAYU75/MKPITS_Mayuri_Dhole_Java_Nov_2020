//Java Program to demonstrate the real scenario of Java Method Overriding
//where three classes are overriding the method of a parent class.(Example: Bank class)
class BankMethodOverridingEx5
{
	static int roi=2;
    int getRateOfInterest()
    {
		return 0;
    }
    static void showroi()
    {
		System.out.println("roi from static method : " + roi);
	}
}

//Creating child classes.
class SBIMethodOverridingEx5 extends BankMethodOverridingEx5
{
	int getRateOfInterest()
	{
		roi=roi+2;
		return roi;
	}
}

class ICICIMethodOverridingEx5 extends BankMethodOverridingEx5
{
    int getRateOfInterest()
    {
		return 7;
    }
}

class AXISMethodOverridingEx5 extends BankMethodOverridingEx5
{
    int getRateOfInterest()
    {
		return 9;
    }
}

//Test class to create objects and call the methods
class MethodOverridingEx5
{
    public static void main(String args[])
    {
    	SBIMethodOverridingEx5 s=new SBIMethodOverridingEx5();
    	BankMethodOverridingEx5.showroi();
    	ICICIMethodOverridingEx5 i=new ICICIMethodOverridingEx5();
    	AXISMethodOverridingEx5 a=new AXISMethodOverridingEx5();
    	System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
   		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
   		System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}
