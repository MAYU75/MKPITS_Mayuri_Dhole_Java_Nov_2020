//Java program to call default constructor from parameterized constructor using this keyword.
class AThis
{
	//int x;
    AThis()
    {
		System.out.println("Hello default constructor ");
	}
    AThis(int x)
    {
    	this();
    	System.out.println("Hello parameterized constructor x= " + x);  //10
    	//System.out.println("x= " + this.x); This statement prints the value of x= 0 i.e default
    	//value of instance variable.
    }
}

class example3this
{
	public static void main(String[] args)
    {
        AThis a=new AThis(10);
    }
}