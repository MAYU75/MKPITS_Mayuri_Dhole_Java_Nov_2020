//Java program Example to access the package from outside the package.
//Using packagename.classname
//If you import package.classname
//then only declared class of this package will be accessible.
//save by B1.java

package mypack;
import pack.A1;

class B1
{
      public static void main(String args[])
      {
      	 A1 obj = new A1();
      	 obj.msg();
      }
}
