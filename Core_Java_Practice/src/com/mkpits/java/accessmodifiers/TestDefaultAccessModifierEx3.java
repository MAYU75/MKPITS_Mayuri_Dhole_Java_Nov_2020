//Java program to demonstrate default access modifier using package bank and class Account .

import bank.AccountDefaultAccessModifierEx3;
import java.util.*;

class TestDefaultAccessModifierEx3 {
	public static void main(String[] arg) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter amount to deposit");
		int amount=s.nextInt();
		AccountDefaultAccessModifierEx3 act=new AccountDefaultAccessModifierEx3();
		//act.bal=500; since bal is default
		String str=act.deposit(amount);
		System.out.println(str);
	}
}
