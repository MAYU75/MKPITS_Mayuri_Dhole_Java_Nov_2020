//9) Java program to create a class book having fields bookid,bookname,price and author and getdata
//method and showdata method without parameters.

import java.util.*;

class book9 {
    //Attributes
    private int bookid;
    private String bookname;
    private float price;
    private String author;

    //Methods
    void getdata() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Book ID: ");
        bookid = scan.nextInt();
        System.out.println("Enter the Book Name: ");
        bookname = scan.next();
        System.out.println("Enter the Book Price: ");
        price = scan.nextFloat();
        System.out.println("Enter the Book Author: ");
        author = scan.next();
    }

    void showdata() {
        System.out.println("Book ID: " + bookid);
        System.out.println("Book Name: " + bookname);
        System.out.println("Book Price: " + price);
        System.out.println("Book Author: " + author);
    }
}

class book9main {
    public static void main(String[] args) {
        book9 b = new book9();
        b.getdata();
        b.showdata();
    }
}