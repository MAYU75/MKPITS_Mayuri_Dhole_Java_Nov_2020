//Java program Example to access the package from outside the package.
//using packagename.*
//If you use package.* then all the classes and interfaces
//of this package will be accessible but not subpackages.


package pack;

public class PackageEx1
{
      public void msg()
      {
		  System.out.println("Hello from class PackageEx1 of package pack which is imported in package mypack having class TestPackageEx1.");
      }
}
