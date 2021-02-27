//Java Program to demonstrate how to handle
//ArrayIndexOutOfBoundsException in a Java Array.

class TestArrayExceptionEx
{
	public static void main(String args[])
	{
       int arr[]={50,60,70,80};
       for(int i=0;i<=arr.length;i++)
       {
		   try
		   {
   		 	   System.out.println(arr[i]);
   		   }
   		   catch(ArrayIndexOutOfBoundsException ee)
   		   {
	   			System.out.println(ee);
   		   }
       }
	   System.out.println("bye");
    }
}
