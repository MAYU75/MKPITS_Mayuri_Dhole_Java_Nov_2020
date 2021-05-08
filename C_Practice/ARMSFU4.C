
//Program to check whether the given number is armstrong number or not
//using function with no arguments and with return type
#include<stdio.h>
#include<conio.h>

int armstrong();

void main()
{
 int a;
 clrscr();
 a=armstrong();
 if(a==1)
 printf("\n The entered number is an ARMSTRONG number.");
 else
 printf("\n The entered number is an not ARMSTRONG number.");
 getch();
}

int armstrong()
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
  return 1;
// printf("\n %d is an armstrong number.",originalnum);
 }
 else
 {
  return 0;
// printf("\n %d is not an armstrong number.",originalnum);
 }
}