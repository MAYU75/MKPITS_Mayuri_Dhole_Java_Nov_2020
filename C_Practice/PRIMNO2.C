//C program to determine whether a given number is prime or not.

#include<stdio.h>
#include<conio.h>

void main()
{
 int i,flag=0,num;
 clrscr();
 printf("\n Enter the number: ");
 scanf("%d",&num);
 for(i=2;i<=num/2;i++)
 {
  if(num%i==0)
  {
    flag=1;
    break;
  }
 }
 if(flag==0 && num!=1)
 {
  printf("\n%d is a prime number.",num);
 }
 else
 {
  printf("\n%d is not a prime number.",num);
 }
 getch();
}
