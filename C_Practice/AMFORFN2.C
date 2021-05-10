//C program to check whether the entered number is armstrong number or not
//using for loop and function with arguments and no return type
#include<stdio.h>
#include<conio.h>

void armstrong(int);

void main()
{
 int n;
 clrscr();
 printf("\n Enter the 3 digit number to check whether it is armstrong number or not:");
 scanf("%d",&n);
 armstrong(n);
 getch();
}

void armstrong(int num)
{
 int i,remainder,result=0,originalnum;
 originalnum=num;
 for(i=0;i<3;i++)
 {
 if(num!=0)
 {
  remainder=num%10;
  result=(result+(remainder*remainder*remainder));
  num=num/10;
 }
 }
 if(result==originalnum)
 {
 printf("\n %d is an armstrong number.",originalnum);
 }
 else
 {
 printf("\n %d is not an armstrong number.",originalnum);
 }
}