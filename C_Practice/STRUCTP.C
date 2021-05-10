//Creating structure product having members prodid, prodname, prodrate,
//prodquantity
#include<stdio.h>
#include<conio.h>

struct product
{
 int prodid,prodquantity;
 float prodrate;
 char prodname[15];
}prod1;

void main()
{
 clrscr();
 printf("\n Enter the id, quantity, rate and name of the product: ");
 scanf("%d%d%f",&prod1.prodid,&prod1.prodquantity,&prod1.prodrate);
 gets(prod1.prodname);
 printf("\n--------------------Product Details-----------------------");
 printf("\n Product ID: %d",prod1.prodid);
 printf("\n Product Quantity: %d",prod1.prodquantity);
 printf("\n Product Rate: %.2f",prod1.prodrate);
 printf("\n Product Name: %s",prod1.prodname);
 getch();
}
