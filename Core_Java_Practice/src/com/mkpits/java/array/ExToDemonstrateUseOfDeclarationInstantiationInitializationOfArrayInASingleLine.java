//Java Program to illustrate the use of declaration, instantiation
//and initialization of Java array in a single line

package src.com.mkpits.java.array;

class ExToDemonstrateUseOfDeclarationInstantiationInitializationOfArrayInASingleLine {
    public static void main(String[] args) {
        int a[] = {33, 3, 4, 5};//declaration, instantiation and initialization
        //printing array
        for (int i = 0; i < a.length; i++)//length is the property of array
            System.out.println(a[i]);
    }
}
