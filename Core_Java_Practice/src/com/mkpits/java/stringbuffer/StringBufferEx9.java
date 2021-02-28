//Java program to demonstrate StringBuffer reverse() method
//The reverse() method of StringBuilder class reverses the current string.

import java.util.*;
class StringBufferEx9 {
	public static void main(String args[]) {
		String str="";
		String str1="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String fn=sc.next();
		StringBuffer sb=new StringBuffer(fn);
		str=sb.toString();
	    sb.reverse();//now original string is changed
	    str1=sb.toString();
	    System.out.println("str " + str);
	    System.out.println("str1 " + str1);
	    if(str.equals(str1))
		    System.out.println("string is palendrome");
		else
	     	System.out.println("string is not palendrome");
	}
}
