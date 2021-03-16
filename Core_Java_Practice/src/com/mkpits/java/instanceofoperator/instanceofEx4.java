//Java program Example real usage of instanceof operator in java.

interface Printable{}

class AinstanceofEx4 implements Printable
{
    public void a()
    {
		System.out.println("a method");
    }
}

class BinstanceofEx4 implements Printable
{
    public void b()
    {
		System.out.println("b method");
    }
}

class Call
{
    void invoke(Printable p)
	{
		//upcasting
	    if(p instanceof AinstanceofEx4)
		{
    		AinstanceofEx4 obj=(AinstanceofEx4)p;//Downcasting
    		obj.a();
    	}
    	if(p instanceof BinstanceofEx4)
    	{
    		BinstanceofEx4 obj1=(BinstanceofEx4)p;//Downcasting
    		obj1.b();
    	}

    }
}//end of Call class

class instanceofEx4
{
    public static void main(String args[])
    {
    	Printable p=new BinstanceofEx4();
    	Call c=new Call();
    	c.invoke(p);
    }
}
