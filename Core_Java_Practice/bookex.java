5) create a class book having fields bookname,author and price 
and a blank constructor and constructor with 3 parameters.

class book
{
	String bookname;
	String author;
	float price;
	//creating a blank constructor
	public  book()
	{
		bookname="java";
		author="ekta";
		price=200.00f;

	}

	//creating a parameterized constructor
	public  book(String bn,String au,float pr)
		{
			bookname=bn;
			author=au;
			price=pr;
	}
	//creating a parameterized constructor
		public  book(String bn,float pr,String au)
			{
				bookname=bn;
				author=au;
				price=pr;
		}


	public void show()
	{
		System.out.println("bookname = " + bookname);
		System.out.println("author = " + author   );
		System.out.println("price = " + price);
	}
}
class bookex
{
	public static void main(String[] arg)
	{
		book b=new book(); // automatically it will call constructor without parameters
		System.out.println("\n");
		System.out.println("book 1 details");
		b.show();

		book b1=new book("oracle","mayuri",500.0f);//constructor with 3 parameters
			System.out.println("\n");
			System.out.println("book 2 details");
		b1.show();

			book b2=new book("oracle",500.0f,"visual basic");//constructor with 3 parameters
			System.out.println("\n");
			System.out.println("book 3 details");
		b2.show();


	}
}