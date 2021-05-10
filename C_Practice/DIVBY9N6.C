//C program to find the number and sum of all integer between 100 and 200
//which are divisible by 9.
//Numbers between 100 and 200,divisible by 9:
//108 117 126 135 144 153 162 171 180 189 198
//The sum: 1683

#include<stdio.h>
#include<conio.h>

void main()
{
 int i,sum=0;
 clrscr();
 printf("\n The numbers between 100 and 200 which are divisible by 9 are:\n");
 for(i=100;i<=200;i++)
 {
  if(i%9 == 0)
  {
   printf("%d\t",i);
   sum=sum+i;
  }
 }
 printf("\n Sum of the numbers between 100 and 200 which are divisible by 9 is %d",sum);
 getch();
 }