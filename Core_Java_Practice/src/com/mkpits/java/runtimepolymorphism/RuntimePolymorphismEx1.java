//Java program to demonstrate Runtime polymorphism.
//Runtime polymorphism or Dynamic Method Dispatch is a process in which
//a call to an overridden method is resolved at runtime rather than compile-time.

class BankRuntimePolymorphismEx1
{
	int getRateOfInterest()
	{
		return 0;
	}
}

//Creating child classes.
class SBIRuntimePolymorphismEx1 extends BankRuntimePolymorphismEx1
{
	int getRateOfInterest()
	{
		return 8;
	}
}

class ICICIRuntimePolymorphismEx1 extends BankRuntimePolymorphismEx1
{
    int getRateOfInterest()
    {
		return 7;
    }
}

class AXISRuntimePolymorphismEx1 extends BankRuntimePolymorphismEx1
{
    int getRateOfInterest()
    {
		return 9;
    }
}

//class to create objects and call the methods
class RuntimePolymorphismEx1
{
    public static void main(String[] args)
    {
		BankRuntimePolymorphismEx1 b=null;
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter bank name");
		String bn=scan.next();
		if(bn.equals("SBI"))
    	b=new SBIRuntimePolymorphismEx1();
    	else if(bn.equals("ICICI"))
    	b=new ICICIRuntimePolymorphismEx1();
    	else if(bn.equals("AXIS"))
    	b=new AXISRuntimePolymorphismEx1();
		System.out.println("Rate of Interest: "+b.getRateOfInterest());
	}
}
