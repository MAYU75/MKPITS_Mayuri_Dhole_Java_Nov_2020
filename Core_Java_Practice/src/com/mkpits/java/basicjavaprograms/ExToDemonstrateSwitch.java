//Java program to demonstrate how to perform addition of two numbers using switch

package src.com.mkpits.java.basicjavaprograms;

class ExToDemonstrateSwitch {
    public static void main(String[] args) {
        int num1 = 7, num2 = 5, res;
        char ch = '+';
        switch (ch) {
            case '+':
                res = num1 + num2;
                System.out.println("The addition of two numbers is " + res);
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}