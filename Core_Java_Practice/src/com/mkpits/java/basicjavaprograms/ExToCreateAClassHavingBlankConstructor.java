//4) Java program to create a class book having fields bookname, author and price and a blank constructor.

package src.com.mkpits.java.basicjavaprograms;

class book {
    String bookname;
    String author;
    float price;

    //creating a blank constructor
    public book() {
        bookname = "Java Programming";
        author = "Mayuri";
        price = 250.00f;
    }

    public void showdata() {
        System.out.println("Bookname = " + bookname);
        System.out.println("Author = " + author);
        System.out.println("Price = " + price);
    }
}

class ExToCreateAClassHavingBlankConstructor {
    public static void main(String[] args) {
        book b = new book(); // automatically it will call blank constructor
        b.showdata();
    }
}