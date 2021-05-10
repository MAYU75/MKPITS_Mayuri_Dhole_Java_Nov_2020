//Creating structure customer having members custid, custname, custaddress,
//custmno. Create a function getdata to accept structure and showdata to
//display structure. (Example of function returning structure.

#include<stdio.h>
#include<conio.h>

struct customer getdata();
void showdata(struct customer);

struct customer
{
 int custid;
 char custname[25],custaddress[25],custmno[10];
}cust1;

void main()
{
 clrscr();
 cust1=getdata();
 showdata(cust1);
 getch();
}

struct customer getdata()
{
 struct customer c;
 printf("\n Enter the id and name of the first customer: ");
 scanf("%d",&c.custid);
 gets(c.custname);
 printf("\n Enter the address and mobile number of the first customer: ");
 gets(c.custaddress);
 gets(c.custmno);
 return c;
}

void showdata(struct customer c)
{
 printf("\n--------------------Customer 1 Details------------------------");
 printf("\n Customer ID: %d",c.custid);
 printf("\n Customer Name: %s",c.custname);
 printf("\n Customer Address: %s",c.custaddress);
 printf("\n Customer Mobile Number: %s",c.custmno);
 printf("\n---------------------------------------------------------------");
}
