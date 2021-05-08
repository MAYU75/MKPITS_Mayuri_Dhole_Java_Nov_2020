#include<stdio.h>
#include<conio.h>
void main()
{
 int employee_id,total_work;
 float amount_per_hour,salary;
 clrscr();
 printf("\n Enter the employee id,total worked hours of a month and amount received per hour:");
 scanf("%d%d%f",&employee_id,&total_work,&amount_per_hour);
 salary=total_work*amount_per_hour;
 printf("\n Employee Id: %d",employee_id);
 printf("\n Salary per month of the employee: %f",salary);
 getch();
}