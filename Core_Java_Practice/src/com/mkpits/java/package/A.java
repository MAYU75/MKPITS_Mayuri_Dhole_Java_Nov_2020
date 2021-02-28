//Java program Example to access the package from outside the package.
//using packagename.*
//If you use package.* then all the classes and interfaces
//of this package will be accessible but not subpackages.
//save by A.java

package pack;

public class A
{
      public void msg()
      {
		  System.out.println("Hello from class A of package pack which is imported in package mypack having class B.");
      }
}
