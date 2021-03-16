//5) Java program to create a class book having fields bookname,author and price
//and a blank constructor and constructor with 3 parameters.

class book5 {
    String bookname;
    String author;
    float price;

    //creating a blank constructor
    public book5() {
        bookname = "Java Programming";
        author = "Mayuri";
        price = 250.00f;

    }

    //creating a parameterized constructor
    public book5(String bn, String au, float pr) {
        bookname = bn;
        author = au;
        price = pr;
    }

    //creating a parameterized constructor
    public book5(String bn, float pr, String au) {
        bookname = bn;
        author = au;
        price = pr;
    }

    public void showbook5() {
        System.out.println("Bookname = " + bookname);
        System.out.println("Author = " + author);
        System.out.println("Price = " + price);
    }
}

class book5main {
    public static void main(String[] args) {
        book5 b = new book5(); // automatically it will call constructor without parameters
        System.out.println("\n");
        System.out.println("Book 1 details");
        b.showbook5();
        book5 b1 = new book5("Oracle", "Simran", 500.0f);//constructor with 3 parameters
        System.out.println("\n");
        System.out.println("Book 2 details");
        b1.showbook5();
        book5 b2 = new book5("Python", 500.0f, "Priyanka");//constructor with 3 parameters
        System.out.println("\n");
        System.out.println("Book 3 details");
        b2.showbook5();
    }
}