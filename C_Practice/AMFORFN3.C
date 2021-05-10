//C program to check whether the entered number is armstrong number or not
//using for loop and function with arguments and return type
#include<stdio.h>
#include<conio.h>

int armstrong(int);

void main()
{
 int n,a;
 clrscr();
 printf("\n Enter the 3 digit number to check whether it is armstrong number or not:");
 scanf("%d",&n);
 a=armstrong(n);
 if(a==1)
  printf("\n %d is an armstrong number.",n);
 else
  printf("\n %d is not an armstrong number.",n);
 getch();
}

int armstrong(int num)
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
 return 1;
 }
 else
 {
 return 0;
 }
}