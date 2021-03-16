//Java program to call default constructor from parameterized constructor using this keyword.
class AThisKeyword
{
	int x;
	AThisKeyword()
    {
		x=20;
		System.out.println("Hello default constructor x = " + x); //20
	}
	AThisKeyword(int x)
    {
    	this();
    	System.out.println("Hello parameterized constructor x= " + this.x); //20
    }
}

class example2this
{
	public static void main(String[] args)
    {
		AThisKeyword a=new AThisKeyword(10);
    }
}