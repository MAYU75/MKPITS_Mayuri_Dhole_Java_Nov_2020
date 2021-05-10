//Creating structure department having members deptid, deptname

#include<stdio.h>
#include<conio.h>

struct department
{
 int deptid;
 char deptname[25];
}dept1,dept2;

void main()
{
 clrscr();
 printf("\n Enter the id and name of the first department: ");
 scanf("%d",&dept1.deptid);
 gets(dept1.deptname);
 printf("\n--------------------Department 1 Details-----------------------");
 printf("\n Department ID: %d",dept1.deptid);
 printf("\n Department Name: %s",dept1.deptname);
 printf("\n---------------------------------------------------------------");
 printf("\n Enter the id and name of the second department: ");
 scanf("%d",&dept2.deptid);
 gets(dept2.deptname);
 printf("\n--------------------Department 2 Details-----------------------");
 printf("\n Department ID: %d",dept2.deptid);
 printf("\n Department Name: %s",dept2.deptname);
 getch();
}
