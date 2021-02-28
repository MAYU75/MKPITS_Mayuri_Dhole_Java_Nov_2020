//Java program Example for creating package bank having public class Account.
package bank;

public class Account
{
	public int bal=1000;
	public String deposit(int amt)
	{
		bal=bal + amt;
		return "amount deposited , bal is " + bal;
	}
}
