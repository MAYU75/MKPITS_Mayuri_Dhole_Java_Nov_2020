//Java program to demonstrate StringBuffer append() method.
//The append() method concatenates
//the given argument with this string.

class StringBufferEx1
{
    public static void main(String args[])
    {
    	StringBuffer sb=new StringBuffer("Hello ");
    	sb.append("Java");//now original string is changed
    	System.out.println(sb);//prints Hello Java
    }
}
