//Java program to call parameterized constructor from default constructor using this keyword.
class ACallParameterizedConstructor
{
	int x;
    ACallParameterizedConstructor()
    {
		this(10);
		x=20;
		System.out.println("hello default constructor x = " + x); //20
	}
    ACallParameterizedConstructor(int x)
    {
		System.out.println("Hello parameterized constructor x= " + x); //10
    }
}

class example4this
{
    public static void main(String[] args)
    {
        ACallParameterizedConstructor a=new ACallParameterizedConstructor();
    }
}