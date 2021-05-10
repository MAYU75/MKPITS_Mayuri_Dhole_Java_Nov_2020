//Creating structure customer having members custid, custname, custaddress,
//custmno. Create a function to accept an array of structure of 5 elements.

#include<stdio.h>
#include<conio.h>

struct customer
{
 int custid;
 char custname[25],custaddress[25],custmno[25];
}cust[5];

void arraystructure(struct customer c[]);

void main()
{
 clrscr();
 arraystructure(cust);
 getch();
}

void arraystructure(struct customer c[])
{
 int i;
 for(i=0;i<5;i++)
 {
  printf("\n Enter the id and name of the %d st/th/nd/rd customer: ",i+1);
  scanf("%d",&c[i].custid);
  gets(c[i].custname);
  printf("\n Enter the address and mobile number of the first customer: ");
  gets(c[i].custaddress);
  gets(c[i].custmno);
 }
 for(i=0;i<5;i++)
 {
  printf("\n--------------------Customer Details------------------------");
  printf("\n Customer ID: %d",c[i].custid);
  printf("\n Customer Name: %s",c[i].custname);
  printf("\n Customer Address: %s",c[i].custaddress);
  printf("\n Customer Mobile Number: %s",c[i].custmno);
  printf("\n---------------------------------------------------------------");
 }
}
