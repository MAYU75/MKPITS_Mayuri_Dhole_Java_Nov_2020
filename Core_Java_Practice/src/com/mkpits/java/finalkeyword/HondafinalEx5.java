//Java program Example of Java final method.
//final method is inherited but you cannot override it.

class BikefinalEx5
{
      final void run()
      {
		  System.out.println("running...");
	  }
}

class HondafinalEx5 extends BikefinalEx5
{
       public static void main(String args[])
       {
       		 new HondafinalEx5().run();
       }
}
