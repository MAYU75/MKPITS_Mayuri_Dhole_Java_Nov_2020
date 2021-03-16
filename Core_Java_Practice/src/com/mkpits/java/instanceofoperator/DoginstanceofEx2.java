//Java program example for java instanceof operator.
//An object of subclass type is also a type of parent class.
//For example, if Dog extends Animal then object of Dog can be
//referred by either Dog or Animal class.

class AnimalinstanceofEx2{}

class DoginstanceofEx2 extends AnimalinstanceofEx2
{
	//DoginstanceofEx2 inherits AnimalinstanceofEx2
	public static void main(String args[])
	{
    	DoginstanceofEx2 d=new DoginstanceofEx2();
    	System.out.println(d instanceof AnimalinstanceofEx2);//true
    }
}
