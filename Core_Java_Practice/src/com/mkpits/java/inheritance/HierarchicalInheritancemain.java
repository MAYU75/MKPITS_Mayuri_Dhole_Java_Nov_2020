//Simple Java program example for Hierarchical Inheritance.

class AnimalHierarchicalInheritanceEx
{
    void eat()
    {
    	System.out.println("eating...");
    }
}

class DogHierarchicalInheritanceEx extends AnimalHierarchicalInheritanceEx
{
    void bark()
    {
    	System.out.println("barking...");
    }
}

class CatHierarchicalInheritanceEx extends AnimalHierarchicalInheritanceEx
{
    void meow()
    {
    	System.out.println("meowing...");
    }
}

class HierarchicalInheritancemain
{
    public static void main(String args[])
    {
    	CatHierarchicalInheritanceEx c=new CatHierarchicalInheritanceEx();
    	c.meow();
    	c.eat();
    	//c.bark();//C.T.Error
    	DogHierarchicalInheritanceEx d = new DogHierarchicalInheritanceEx();
    	d.bark();
    	d.eat();
    }
}
