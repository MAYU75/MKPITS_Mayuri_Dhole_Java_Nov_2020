//Java program to demonstrate Protected access modifier.
//The access level of a protected modifier is within the package and
//outside the package through child class.
//If you do not make the child class, it cannot be accessed from outside the package.

package pro;

public class ParentClassProtectedAccessModifierEx4 {
	protected void showmethod() {
		System.out.println("show method ");
	}
}
