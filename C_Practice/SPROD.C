//Creating structure product having members prodid, prodname, prodrate,
//prodquantity. Pass this structure to function to display structure
//members values
#include<stdio.h>
#include<conio.h>

void display(struct product);

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
 display(prod1);
 getch();
}

void display(struct product p)
{
 printf("\n--------------------Product Details-----------------------");
 printf("\n Product ID: %d",p.prodid);
 printf("\n Product Quantity: %d",p.prodquantity);
 printf("\n Product Rate: %.2f",p.prodrate);
 printf("\n Product Name: %s",p.prodname);
}
