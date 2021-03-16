//Java program to demonstrate Runtime polymorphism using Bank class.

class BankPolymorphismEx1
{
    float getRateOfInterest()
    {

        return 0;
    }
}

class SBIPolymorphismEx1 extends BankPolymorphismEx1
{
    float getRateOfInterest()
    {
		return 8.4f;
    }
}

class ICICIPolymorphismEx1 extends BankPolymorphismEx1
{
    float getRateOfInterest()
    {
		return 7.3f;
    }
}

class AXISPolymorphismEx1 extends BankPolymorphismEx1
{
    float getRateOfInterest()
    {
		return 9.7f;
    }
}

class PolymorphismEx1
{
    public static void main(String[] args)
    {
    	BankPolymorphismEx1 b;
    	b=new SBIPolymorphismEx1();
    	System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
    	b=new ICICIPolymorphismEx1();
    	System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());
    	b=new AXISPolymorphismEx1();
    	System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());
    }
}
