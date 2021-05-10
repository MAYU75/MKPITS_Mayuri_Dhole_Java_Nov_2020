//Creating structure customer having members custid, custname, custaddress,
//custmno. Create a function with pointer argument and pass the above
//structure to this function.

#include<stdio.h>
#include<conio.h>

void showdata(struct customer *);

struct customer
{
 int custid;
 char custname[25],custaddress[25],custmno[25];
}cust1,*cust;

void main()
{
 clrscr();
 cust=&cust1;
 printf("\n Enter the id and name of the customer: ");
 scanf("%d",&cust1.custid);
 gets(cust1.custname);
 printf("\n Enter the address and mobile number of the customer: ");
 gets(cust1.custaddress);
 gets(cust1.custmno);
 showdata(cust);
 getch();
}

void showdata(struct customer *c)
{
 printf("\n--------------------Customer Details------------------------");
 printf("\n Customer ID: %d",c->custid);
 printf("\n Customer Name: %s",c->custname);
 printf("\n Customer Address: %s",c->custaddress);
 printf("\n Customer Mobile Number: %s",c->custmno);
 printf("\n---------------------------------------------------------------");
}
