//C program to print on screen the output of adding,subtracting,multiplying
//and dividing of two numbers which will be entered by the user.
#include<stdio.h>
#include<conio.h>

void main()
{
 int num1,num2,res;
 clrscr();
 printf("\n Enter two numbers: ");
 scanf("%d%d",&num1,&num2);
 res=num1+num2;
 printf("\n Addition of two numbers is %d",res);
 res=num1-num2;
 printf("\n Subtraction of two numbers is %d",res);
 res=num1*num2;
 printf("\n Multiplication of two numbers is %d",res);
 res=num1/num2;
 printf("\n Division of two numbers is %d",res);
 getch();
}