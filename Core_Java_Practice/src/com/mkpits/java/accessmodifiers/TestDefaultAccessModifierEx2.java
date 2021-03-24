//Java program to demonstrate Default access modifier.
//The access level of a default modifier is only within the package.
//It cannot be accessed from outside the package.
//If you do not specify any access level, it will be the default.

package src.com.mkpits.java.accessmodifiers;

class TestDefaultAccessModifierEx2 {
    public static void main(String[] arg) {
        p2.DefaultAccessModifierEx2 ex = new p2.DefaultAccessModifierEx2();
        //ex.a=40; error since a is default
        // ex.msg();
        ex.showmsg();
    }
}
