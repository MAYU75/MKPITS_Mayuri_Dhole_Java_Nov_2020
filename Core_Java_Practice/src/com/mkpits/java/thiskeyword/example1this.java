//Java program example of using this keyword to refer current class book's instance variable
//bookname
class BookThisKeyword
{
	//creating instance variable
	String bookname;
	//creating a constructor with parameters
	public BookThisKeyword(String bookname)
	{
		this.bookname=bookname;
	}
	//creating a method display
	public void display()
	{
		System.out.println("Bookname: " + bookname);
	}
}
//creating a class
class example1this
{
	public static void main(String[] args)
	{
		BookThisKeyword b1=new BookThisKeyword("java");
		b1.display();
	}
}