//Java program to demonstrate protected access modifier.
//In this example, we have created the two packages pack and mypack.
//The A class of pack package is public, so can be accessed from outside the package.
//But msg method of this package is declared as protected,
//so it can be accessed from outside the class only through inheritance.

package pack;

public class ProtectedAccessModifierEx5 {
    protected void msg() {
		System.out.println("Hello");
	}
}

