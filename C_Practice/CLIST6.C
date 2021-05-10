//C program to print the output of multiplication of three numbers which
//will be entered by the user.

#include<stdio.h>
#include<conio.h>

void main()
{
 int num1,num2,num3,mul;
 clrscr();
 printf("\n Enter the three numbers for multiplication: ");
 scanf("%d%d%d",&num1,&num2,&num3);
 mul=num1*num2*num3;
 printf("\n Multiplication of three numbers is %d",mul);
 getch();
}