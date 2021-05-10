//Creating structure customer having members custid, custname, custaddress,
//custmno

#include<stdio.h>
#include<conio.h>

struct customer
{
 int custid;
 char custname[25],custaddress[25],custmno[25];
}cust1,cust2;

void main()
{
 clrscr();
 printf("\n Enter the id and name of the first customer: ");
 scanf("%d",&cust1.custid);
 gets(cust1.custname);
 printf("\n Enter the address and mobile number of the first customer: ");
 gets(cust1.custaddress);
 gets(cust1.custmno);
 printf("\n--------------------Customer 1 Details------------------------");
 printf("\n Customer ID: %d",cust1.custid);
 printf("\n Customer Name: %s",cust1.custname);
 printf("\n Customer Address: %s",cust1.custaddress);
 printf("\n Customer Mobile Number: %s",cust1.custmno);
 printf("\n---------------------------------------------------------------");
 printf("\n Enter the id and name of the second customer: ");
 scanf("%d",&cust2.custid);
 gets(cust2.custname);
 printf("\n Enter the address and mobile number of the second customer: ");
 gets(cust2.custaddress);
 gets(cust2.custmno);
 printf("\n--------------------Customer 2 Details------------------------");
 printf("\n Customer ID: %d",cust2.custid);
 printf("\n Customer Name: %s",cust2.custname);
 printf("\n Customer Address: %s",cust2.custaddress);
 printf("\n Customer Mobile Number: %s",cust2.custmno);
 getch();
}
