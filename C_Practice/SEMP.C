//Creating structure employee having members empno,empname,designation,
//salary. Pass this structure to function to display structure members value
#include<stdio.h>
#include<conio.h>
#include<string.h>

void displaydata(struct employee);

struct employee
{
 int empno;
 char empname[20],desig[30];
 float salary;
}emp1;

void main()
{
 clrscr();
 emp1.empno=5;
 strcpy(emp1.empname,"Aboli");
 strcpy(emp1.desig,"Manager");
 emp1.salary=30000.00;
 displaydata(emp1);
 getch();
}

void displaydata(struct employee e)
{
 printf("\n ---------------Employee details --------------");
 printf("\n Employee no: %d",e.empno);
 printf("\n Employee Name: %s",e.empname);
 printf("\n Employee Designation: %s",e.desig);
 printf("\n Employee salary: %.2f",e.salary);
}