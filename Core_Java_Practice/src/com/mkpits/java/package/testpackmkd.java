//Java program Example to put two public classes in a package.
//If you want to put two public classes in a package,
//have two java source files containing one public class,
//but keep the package name same.

//import mkd.*;
import mkd.A4;
import mkd.B4;

class testpackmkd
{
	public static void main(String[] arg)
	{
		A4 a=new A4();
		a.msg();
		B4 b=new B4();
		b.msg();
	}
}
