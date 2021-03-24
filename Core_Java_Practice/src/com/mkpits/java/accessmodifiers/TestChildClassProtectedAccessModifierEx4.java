//Java program to demonstrate Protected access modifier.
//The access level of a protected modifier is within the package and
//outside the package through child class.
//If you do not make the child class, it cannot be accessed from outside the package.

package src.com.mkpits.java.accessmodifiers;

import pro.ParentClassProtectedAccessModifierEx4;

class TestChildClassProtectedAccessModifierEx4 extends ParentClassProtectedAccessModifierEx4 {
    public static void main(String[] arg) {
        TestChildClassProtectedAccessModifierEx4 p = new TestChildClassProtectedAccessModifierEx4();
        p.showmethod();
    }
}
