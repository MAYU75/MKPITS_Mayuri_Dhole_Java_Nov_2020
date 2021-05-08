//Program to perform addtion of two numbers using pointer and
//using function with no arguments and no return type
#include<stdio.h>
#include<conio.h>

void sumpointer();

void main()
{
 clrscr();
 sumpointer();
 getch();
}

void sumpointer()
{
 int a,b,*p,*q,sum;
 printf("\n Enter two values:");
 scanf("%d%d",&a,&b);
 p=&a;
 q=&b;
 sum=*p+*q;
 printf("\n Sum of the number is %d",sum);
}
