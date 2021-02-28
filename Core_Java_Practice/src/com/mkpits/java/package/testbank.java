//Java program Example for importing package bank having public class Account
//in class testbank.java source file.

import bank.Account;
import java.util.*;

class testbank
{
	public static void main(String[] arg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter amount to be deposited:");
		int amount=scan.nextInt();
		Account act=new Account();
		String str=act.deposit(amount);
		System.out.println(str);
	}
}
