//Java program Example to access the package from outside the package.
//Using packagename.classname
//If you import package.classname
//then only declared class of this package will be accessible.


package pack;
public class PackageEx2
{
      public void msg()
      {
		  System.out.println("Hello from class PackageEx2 of package pack which is imported in package mypack having class TestPackageEx2.");
      }
}
