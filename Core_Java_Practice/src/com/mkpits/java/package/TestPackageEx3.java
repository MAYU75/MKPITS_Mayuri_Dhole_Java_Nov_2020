//Java program Example to access the package from outside the package.
//Using fully qualified name.
//If you use fully qualified name then only declared class of this package will be accessible.
//Now there is no need to import.
//But you need to use fully qualified name every time
//when you are accessing the class or interface.
//It is generally used when two packages have same class name
//e.g. java.util and java.sql packages contain Date class.


package mypack;

class TestPackageEx3
{
      public static void main(String args[])
      {
      	 pack.PackageEx3 obj = new pack.PackageEx3();//using fully qualified name
      	 obj.msg();
      }
}
