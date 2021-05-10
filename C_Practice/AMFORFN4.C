//C program to check whether the entered number is armstrong number or not
//using for loop and function with no arguments and with return type
#include<stdio.h>
#include<conio.h>

int armstrong();

void main()
{
 int a;
 clrscr();
 a=armstrong();
 if(a==1)
  printf("\n The entered number is an armstrong number.");
 else
  printf("\n The entered number is not an armstrong number.");
 getch();
}

int armstrong()
{
 int num,i,remainder,result=0,originalnum;
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
 return 1;
 }
 else
 {
 return 0;
 }
}