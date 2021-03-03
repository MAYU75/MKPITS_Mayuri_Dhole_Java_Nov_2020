//Java program Example for importing package bank having public class Account
//in class testbank.java source file.

import bank.AccountPackageEx7;
import java.util.*;

class TestBankPackageEx7
{
	public static void main(String[] arg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter amount to be deposited:");
		int amount=scan.nextInt();
		AccountPackageEx7 act=new AccountPackageEx7();
		String str=act.deposit(amount);
		System.out.println(str);
	}
}
