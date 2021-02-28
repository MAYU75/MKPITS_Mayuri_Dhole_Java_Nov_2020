//Java program Example to access the package from outside the package.
//using packagename.*
//If you use package.* then all the classes and interfaces
//of this package will be accessible but not subpackages.
//save by B.java  

package mypack;  
import pack.*;  
      
class B
{  
      public static void main(String args[])
      {  
      	 A obj = new A();  
      	 obj.msg();  
      }  
}  
