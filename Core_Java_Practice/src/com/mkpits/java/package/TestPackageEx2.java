//Java program Example to access the package from outside the package.
//Using packagename.classname
//If you import package.classname
//then only declared class of this package will be accessible.


package mypack;
import pack.PackageEx2;

class TestPackageEx2
{
      public static void main(String args[])
      {
      	 PackageEx2 obj = new PackageEx2();
      	 obj.msg();
      }
}
