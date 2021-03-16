//Java program to demonstrate Runtime polymorphism using Shape class.

class ShapePolymorphismEx2
{
    void draw()
    {
		System.out.println("drawing...");
    }
}
class RectanglePolymorphismEx2 extends ShapePolymorphismEx2
{
    void draw()
    {
		System.out.println("drawing rectangle...");
    }
}
class CirclePolymorphismEx2 extends ShapePolymorphismEx2
{
    void draw()
    {
		System.out.println("drawing circle...");
    }
}
class TrianglePolymorphismEx2 extends ShapePolymorphismEx2
{
    void draw()
    {
		System.out.println("drawing triangle...");
    }
}

class PolymorphismEx2
{
    public static void main(String[] args)
    {
    	ShapePolymorphismEx2 s;
    	s=new RectanglePolymorphismEx2();
    	s.draw();
    	s=new CirclePolymorphismEx2();
    	s.draw();
    	s=new TrianglePolymorphismEx2();
    	s.draw();
    }
}
