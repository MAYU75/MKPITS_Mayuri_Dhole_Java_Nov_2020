#include<stdio.h>
#include<conio.h>
void main()
{
 int num1,num2,remainder;
 clrscr();
 printf("\n Enter two numbers:");
 scanf("%d%d",&num1,&num2);
 remainder=num1%num2;
 printf("\n Remainder is %d",remainder);
 getch();
}