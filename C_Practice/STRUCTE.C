//Creating structure employee having members empno,empname,designation,salary
#include<stdio.h>
#include<conio.h>

struct employee
{
 int empno;
 char empname[20],desig[30];
 float salary;
}emp1,emp2,emp3;

void main()
{
 clrscr();
 printf("\n Enter the employee number of the employee1: ");
 scanf("%d",&emp1.empno);
 printf("\n Enter the name of the employee1: ");
 scanf("%s",&emp1.empname);
 printf("\n Enter the designation of the employee1: ");
 scanf("%s",&emp1.desig);
 printf("\n Enter the salary of the employee1: ");
 scanf("%f",&emp1.salary);
 printf("\n Enter the employee number of the employee2: ");
 scanf("%d",&emp2.empno);
 printf("\n Enter the name of the employee2: ");
 scanf("%s",&emp2.empname);
 printf("\n Enter the designation of the employee2: ");
 scanf("%s",&emp2.desig);
 printf("\n Enter the salary of the employee2: ");
 scanf("%f",&emp2.salary);
 printf("\n Enter the employee number of the employee3: ");
 scanf("%d",&emp3.empno);
 printf("\n Enter the name of the employee3: ");
 scanf("%s",&emp3.empname);
 printf("\n Enter the designation of the employee3: ");
 scanf("%s",&emp3.desig);
 printf("\n Enter the salary of the employee3: ");
 scanf("%f",&emp3.salary);
 printf("\n ---------------Employee 1 details --------------");
 printf("\n Employee no: %d",emp1.empno);
 printf("\n Employee Name: %s",emp1.empname);
 printf("\n Employee Designation: %s",emp1.desig);
 printf("\n Employee salary: %f",emp1.salary);
 printf("\n ---------------Employee 2 details --------------");
 printf("\n Employee no: %d",emp2.empno);
 printf("\n Employee Name: %s",emp2.empname);
 printf("\n Employee Designation: %s",emp2.desig);
 printf("\n Employee salary: %f",emp2.salary);
 printf("\n ---------------Employee 3 details --------------");
 printf("\n Employee no: %d",emp3.empno);
 printf("\n Employee Name: %s",emp3.empname);
 printf("\n Employee Designation: %s",emp3.desig);
 printf("\n Employee salary: %f",emp3.salary);
 getch();
}