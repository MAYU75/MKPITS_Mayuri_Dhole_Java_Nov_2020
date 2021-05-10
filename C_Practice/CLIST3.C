//C program to print the result of dividing two numbers.
#include<stdio.h>
#include<conio.h>

void main()
{
 int num1,num2,division;
 clrscr();
 printf(" Enter two numbers for division: ");
 scanf("%d%d",&num1,&num2);
 division=num1/num2;
 printf("\n Division of two numbers is %d",division);
 getch();
}