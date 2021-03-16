//Java program Example to demonstrate interface in java.
//Interface declaration: by first user

interface DrawableInterfaceEx3
{
	void draw();
}

//Implementation: by second user
class RectangleInterfaceEx3 implements DrawableInterfaceEx3
{
    public void draw()
    {
		System.out.println("drawing rectangle");
	}
}

class CircleInterfaceEx3 implements DrawableInterfaceEx3
{
    public void draw()
    {
		System.out.println("drawing circle");
	}
}

//Using interface: by third user
class InterfaceEx3
{
    public static void main(String[] args)
    {
    	DrawableInterfaceEx3 d=new CircleInterfaceEx3();//In real scenario, object is provided by method e.g. getDrawable()
    	d.draw();
    }
}
