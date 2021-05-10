//C program to find the sum of first 10 natural numbers.

#include<stdio.h>
#include<conio.h>

void main()
{
 int i,sum=0;
 clrscr();
 printf("\n First 10 natural numbers are: ");
 for(i=1;i<=10;i++)
 {
  printf("\n%d",i);
  sum=sum+i;
 }
 printf("\n Sum of first 10 natural numbers is %d",sum);
 getch();
}
