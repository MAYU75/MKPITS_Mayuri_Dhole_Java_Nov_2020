//Java program Example to access the package from outside the package.
//Using packagename.classname
//If you import package.classname
//then only declared class of this package will be accessible.
//save by A1.java

package pack;
public class A1
{
      public void msg()
      {
		  System.out.println("Hello from class A1 of package pack which is imported in package mypack having class B1.");
      }
}
