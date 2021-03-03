//Java program to demonstrate default access modifier using package bank and class Account .

package bank;

public class AccountDefaultAccessModifierEx3 {
	int bal=1000; //default access modifier
	public String deposit(int amt) {
		bal=bal + amt;
		return "amount deposited , bal is " + bal;
	}
}
