//Java program example for Intelligent Overriding (Runtime polymorphism).

import java.util.*;
class AccountIntelligentOverridingEx1
{
	int actno;
	float balance=1000;
	String str="";
	void deposit(float amt)
	{
		balance=balance + amt;
	}
	void withdrawal(float amt)
	{
		balance=balance - amt;
	}
	String showbalance()
	{
		str = "act no " + actno + " balance is " + balance;
		return str;
	}
}

class SavingIntelligentOverridingEx1 extends AccountIntelligentOverridingEx1
{
	int interest = 200;
	//overriding the account class deposit  method
	void deposit(float amt)
	{
		balance=balance + amt + interest;
	}
}

class CurrentIntelligentOverridingEx1 extends AccountIntelligentOverridingEx1
{

}

class IntelligentOverridingEx1
{
    public static void main(String args[])
    {
		AccountIntelligentOverridingEx1 act=null; // creating a base class variable
        Scanner s1=new Scanner(System.in);
        System.out.println("enter account no");
        int ano=s1.nextInt();
        System.out.println("enter amount");
        float amt=s1.nextFloat();
        System.out.println("enter account type (saving or current)");
        String acttype=s1.next();
        System.out.println("enter deposit or withdrawal");
        String tran=s1.next();
        String result="";
        if(acttype.equals("saving"))
        {
		   act=new SavingIntelligentOverridingEx1();
		   act.actno=ano;
		   if(tran.equals("deposit"))
		   {
				act.deposit(amt);
	   	   }
	   	   else if(tran.equals("withdrawal"))
		   {
		   		act.withdrawal(amt);
	   	   }
	   	   result= act.showbalance();
	   	}
	    else if(acttype.equals("current"))
	    {
		   act=new CurrentIntelligentOverridingEx1();
		   act.actno=ano;
		   if(tran.equals("deposit"))
		   {
		   		act.deposit(amt);
		   }
		   else if(tran.equals("withdrawal"))
		   {
		   		act.withdrawal(amt);
		   }
	   	  result= act.showbalance();
	    }
	    else
	    {
		   System.out.println("invalid inputs");
	    }
		System.out.println(result);
	 }
}
