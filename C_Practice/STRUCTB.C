//Creating structure book having members Title, Author, Price
#include<stdio.h>
#include<conio.h>

struct book
{
 char title[20],author[20];
 float price;
};

void main()
{
 struct book b1;
 clrscr();
 printf("\n Enter the title of the book: ");
 gets(b1.title);
 printf("\n Enter the name of the author: ");
 gets(b1.author);
 printf("\n Enter the price: ");
 scanf("%f",&b1.price);
 printf("\n Book Title: %s",b1.title);
 printf("\n Book Author: %s",b1.author);
 printf("\n Book Price: %f",b1.price);
 getch();
}