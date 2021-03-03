//Java program Example to put two public classes in a package.
//If you want to put two public classes in a package,
//have two java source files containing one public class,
//but keep the package name same.

//import mkd.*;
import mkd.PackageEx4;
import mkd.PackagemkdEx4;

class TestPackagemkdEx4
{
	public static void main(String[] arg)
	{
		PackageEx4 a=new PackageEx4();
		a.msg();
		PackagemkdEx4 b=new PackagemkdEx4();
		b.msg();
	}
}
