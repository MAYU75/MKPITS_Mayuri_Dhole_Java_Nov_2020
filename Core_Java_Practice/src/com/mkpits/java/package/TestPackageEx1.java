//Java program Example to access the package from outside the package.
//using packagename.*
//If you use package.* then all the classes and interfaces
//of this package will be accessible but not subpackages.


package mypack;
import pack.*;

class TestPackageEx1
{
      public static void main(String args[])
      {
      	 PackageEx1 obj = new PackageEx1();
      	 obj.msg();
      }
}
