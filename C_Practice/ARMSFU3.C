
//Program to check whether the given number is armstrong number or not
//using function with arguments and no return type
#include<stdio.h>
#include<conio.h>

int armstrong(int);

void main()
{
 int number,a;
 clrscr();
 printf("\n Enter the 3 digit number to check whether it is armstrong number or not:");
 scanf("%d",&number);
 a=armstrong(number);
 if(a==1)
 printf("\n %d is an ARMSTRONG number.",number);
 else
 printf("\n %d is an not ARMSTRONG number.",number);
 getch();
}

int armstrong(int num)
{
 int remainder,result=0,originalnum,i;
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