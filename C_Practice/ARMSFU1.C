//Program to check whether the given number is armstrong number or not
//using function with no arguments and no return type
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
 int num,remainder,result=0,originalnum,i;
 printf("\n Enter the 3 digit number to check whether it is armstrong number or not:");
 scanf("%d",&num);
 originalnum=num;
 i=0;
 while(i<3)
 {
 if(num!=0)
 {
  remainder=num%10;
  result=(result+(remainder*remainder*remainder));
  num=num/10;
 }
 i++;
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