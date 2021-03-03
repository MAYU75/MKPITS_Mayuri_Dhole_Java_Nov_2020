//Java program to demonstrate Access Modifiers with Method Overriding.
//If you are overriding any method, overridden method
//(i.e. declared in subclass) must not be more restrictive.

class AccessModifierEx7 {
    protected void msg() {
		System.out.println("Hello java");
	}
}

public class TestAccessModifierEx7 extends AccessModifierEx7 {
    void msg() {
		System.out.println("Hello java");
	}//C.T.Error
    public static void main(String args[]) {
       TestAccessModifierEx7 obj=new TestAccessModifierEx7();
       obj.msg();
    }
}
