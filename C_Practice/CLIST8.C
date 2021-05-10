//C program that takes a number as input and prints its multiplication table
#include<stdio.h>
#include<conio.h>

void main()
{
 int num,i,r;
 clrscr();
 printf("\n Enter the number whose multiplication table you want to create:");
 scanf("%d",&num);
 printf("\n Multiplication table for %d",num);
 for(i=1;i<=10;i++)
 {
  r=num*i;
  printf("\n %d*%d = %d",i,num,r);
 }
 getch();
}
