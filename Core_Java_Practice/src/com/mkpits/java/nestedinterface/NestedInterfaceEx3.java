//Java program Example of nested interface which is declared within the class.

class StudentNestedInterfaceEx3
{
	interface instudent
	{
		void msg();
	}
	interface instudent1
	{
		void msg1();
	}
}

class NestedInterfaceEx3 implements StudentNestedInterfaceEx3.instudent,StudentNestedInterfaceEx3.instudent1
{
	public void msg()
	{
		System.out.println("hello from msg");
	}
	public void msg1()
	{
		System.out.println("hello from msg1");
	}
	public static void main(String[] arg)
	{
		StudentNestedInterfaceEx3.instudent ss=new NestedInterfaceEx3();
		ss.msg();
		StudentNestedInterfaceEx3.instudent1 ss1=new NestedInterfaceEx3();
		ss1.msg1();
	}
}
