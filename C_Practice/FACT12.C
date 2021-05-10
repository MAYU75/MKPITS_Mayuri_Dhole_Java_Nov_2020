//C program to calculate the factorial of a given number.

#include<stdio.h>
#include<conio.h>

void main()
{
 int i,num,fact=1;
 clrscr();
 printf("\n Enter the number to calculate its factorial: ");
 scanf("%d",&num);
 for(i=1;i<=num;i++)
 {
  fact=fact*i;
 }
 printf("\n Factorial of given number is %d.",fact);
 getch();
}