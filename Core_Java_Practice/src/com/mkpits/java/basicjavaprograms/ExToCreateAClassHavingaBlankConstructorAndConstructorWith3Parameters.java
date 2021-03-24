//5) Java program to create a class book having fields bookname,author and price
//and a blank constructor and constructor with 3 parameters.

package src.com.mkpits.java.basicjavaprograms;

class Book5 {
    String bookname;
    String author;
    float price;

    //creating a blank constructor
    public Book5() {
        bookname = "Java Programming";
        author = "Mayuri";
        price = 250.00f;

    }

    //creating a parameterized constructor
    public Book5(String bn, String au, float pr) {
        bookname = bn;
        author = au;
        price = pr;
    }

    //creating a parameterized constructor
    public Book5(String bn, float pr, String au) {
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

class ExToCreateAClassHavingaBlankConstructorAndConstructorWith3Parameters {
    public static void main(String[] args) {
        Book5 b = new Book5(); // automatically it will call constructor without parameters
        System.out.println("\n");
        System.out.println("Book 1 details");
        b.showbook5();
        Book5 b1 = new Book5("Oracle", "Simran", 500.0f);//constructor with 3 parameters
        System.out.println("\n");
        System.out.println("Book 2 details");
        b1.showbook5();
        Book5 b2 = new Book5("Python", 500.0f, "Priyanka");//constructor with 3 parameters
        System.out.println("\n");
        System.out.println("Book 3 details");
        b2.showbook5();
    }
}