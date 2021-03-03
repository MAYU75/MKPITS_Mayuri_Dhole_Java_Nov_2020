//Java program to demonstrate Default access modifier.
//The access level of a default modifier is only within the package.
//It cannot be accessed from outside the package.
//If you do not specify any access level, it will be the default.

package p2;

public  class DefaultAccessModifierEx2 {
	int a=20;
    void msg() {
		System.out.println("Hello" + a);
	}
    public void showmsg() {
		a=40;
		msg();
	}
}
