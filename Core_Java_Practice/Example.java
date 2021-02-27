class Example
{
	static
	{
		System.out.println("This is static block");
	}
	public Example()
	{
		System.out.println("This is Example constructor");
	}
	public void m()
	{
		System.out.println("This is method m");
	}
	public static void main(String[] args)
	{
		Example obj = new Example();
		obj.m();
	}
}
