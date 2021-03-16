//Java program Example of dynamic binding
//When type of the object is determined at run-time,
//it is known as dynamic binding.

class AnimalDynamicBindingEx1
{
    void eat()
    {
		System.out.println("animal is eating...");
	}
}

class DogDynamicBindingEx1 extends AnimalDynamicBindingEx1
{
    void eat()
    {
		System.out.println("dog is eating...");
	}
    public static void main(String args[])
    {
		AnimalDynamicBindingEx1 a=new DogDynamicBindingEx1();
        a.eat();
    }
}
