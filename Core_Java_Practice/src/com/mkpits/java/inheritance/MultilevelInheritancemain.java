//Simple Java program example for Multilevel Inheritance.
class AnimalMultilevelInheritance
{
    void eat()
    {
		System.out.println("eating...");
	}
}

class DogMultilevelInheritance extends AnimalMultilevelInheritance
{
    void bark()
    {
		System.out.println("barking...");
	}
}

class BabyDogMultilevelInheritance extends DogMultilevelInheritance
{
    void weep()
    {
		System.out.println("weeping...");
	}
}

class MultilevelInheritancemain
{
    public static void main(String args[])
    {
    	BabyDogMultilevelInheritance d=new BabyDogMultilevelInheritance();
    	d.weep();
    	d.bark();
    	d.eat();
    }
}
