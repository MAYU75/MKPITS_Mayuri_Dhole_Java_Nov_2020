//C program to check whether a given number is positive or negative.
#include<stdio.h>
#include<conio.h>

void main()
{
 int num;
 clrscr();
 printf("\n Enter the number and check whether it is positive or negative: ");
 scanf("%d",&num);
 if(num>=0)
  printf("\n The number is positive.");
 else
  printf("\n The number is negative.");
 getch();
}