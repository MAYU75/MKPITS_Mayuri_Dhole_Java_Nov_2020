//Creating structure department having members deptid, deptname
//Create a function getdata to accept structure and showdata to display
//structure (example of function returning structure)

#include<stdio.h>
#include<conio.h>

struct department getdata();
void showdata(struct department);

struct department
{
 int deptid;
 char deptname[25];
}dept1;

void main()
{
 clrscr();
 dept1=getdata();
 showdata(dept1);
 getch();
}

struct department getdata()
{
 struct department d;
 printf("\n Enter the id and name of the department: ");
 scanf("%d",&d.deptid);
 gets(d.deptname);
 return d;
}

void showdata(struct department d)
{
 printf("\n--------------------Department Details-----------------------");
 printf("\n Department ID: %d",d.deptid);
 printf("\n Department Name: %s",d.deptname);
 printf("\n---------------------------------------------------------------");
}