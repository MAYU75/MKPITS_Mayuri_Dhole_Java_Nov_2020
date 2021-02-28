//Java program to demonstrate StringBuffer delete() method
//The delete() method of StringBuffer class deletes
//the string from the specified beginIndex to endIndex.

import java.util.*;
class StringBufferEx7 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String fn=sc.next();
		StringBuffer sb=new StringBuffer(fn);
		System.out.println("enter your lname");
		String ln=sc.next();
	    sb.delete(1,5);//now original string is changed
	    System.out.println(sb);
	}
}
