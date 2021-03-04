//Java program Example to demonstrate interface in java.
//Interface declaration: by first user

interface DrawableEx3
{
	void draw();
}

//Implementation: by second user
class RectangleEx3 implements DrawableEx3
{
    public void draw()
    {
		System.out.println("drawing rectangle");
	}
}

class Circle implements DrawableEx3
{
    public void draw()
    {
		System.out.println("drawing circle");
	}
}

//Using interface: by third user
class InterfaceEx3
{
    public static void main(String args[])
    {
    	DrawableEx3 d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()
    	d.draw();
    }
}
