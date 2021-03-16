//Java program Example of Runtime Polymorphism with Data Member.

class BikePolymorphismEx4
{
	int speedlimit=90;
}

class HondaPolymorphismEx4 extends BikePolymorphismEx4
{
    int speedlimit=150;
    public static void main(String args[])
    {
    	BikePolymorphismEx4 obj=new HondaPolymorphismEx4();
      	System.out.println(obj.speedlimit);//90
    }
}
