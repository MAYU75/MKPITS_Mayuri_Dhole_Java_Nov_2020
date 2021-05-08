#include<stdio.h>
#include<conio.h>
void main()
{
 int num1,num2,div;
 clrscr();
 printf("\n Enter two numbers for division:");
 scanf("%d%d",&num1,&num2);
 div=num1/num2;
 printf("\n Division of two numbers is %d",div);
 getch();
}