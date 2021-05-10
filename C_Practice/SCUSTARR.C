//Creating structure customer having members custid, custname, custaddress,
//custmno. Create an array of structure of 5 elements.

#include<stdio.h>
#include<conio.h>

struct customer
{
 int custid;
 char custname[25],custaddress[25],custmno[25];
}cust[5];

void main()
{
 int i;
 clrscr();
 for(i=0;i<5;i++)
 {
  printf("\n Enter the id and name of the %d st/th/nd/rd customer: ",i+1);
  scanf("%d",&cust[i].custid);
  gets(cust[i].custname);
  printf("\n Enter the address and mobile number of the first customer: ");
  gets(cust[i].custaddress);
  gets(cust[i].custmno);
 }
 for(i=0;i<5;i++)
 {
  printf("\n--------------------Customer Details------------------------");
  printf("\n Customer ID: %d",cust[i].custid);
  printf("\n Customer Name: %s",cust[i].custname);
  printf("\n Customer Address: %s",cust[i].custaddress);
  printf("\n Customer Mobile Number: %s",cust[i].custmno);
  printf("\n---------------------------------------------------------------");
 }
 getch();
}
