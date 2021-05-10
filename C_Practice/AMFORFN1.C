//C program to check whether the entered number is armstrong number or not
//using for loop and function with no arguments and no return type
#include<stdio.h>
#include<conio.h>

void armstrong();

void main()
{
 clrscr();
 armstrong();
 getch();
}

void armstrong()
{
 int i,num,remainder,result=0,originalnum;
 printf("\n Enter the 3 digit number to check whether it is armstrong number or not:");
 scanf("%d",&num);
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