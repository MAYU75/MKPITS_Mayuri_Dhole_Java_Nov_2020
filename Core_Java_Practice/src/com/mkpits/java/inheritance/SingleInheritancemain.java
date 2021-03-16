//Simple Java program example for Single Inheritance.
class AnimalSinglelevelInheritance
{
    void eat()
    {
		System.out.println("eating...");
	}
}

class DogSinglelevelInheritance extends AnimalSinglelevelInheritance
{
    void bark()
    {
		System.out.println("barking...");
	}
}

class SingleInheritancemain
{
    public static void main(String args[])
    {
    	DogSinglelevelInheritance d=new DogSinglelevelInheritance();
    	d.bark();
    	d.eat();
    }
}
