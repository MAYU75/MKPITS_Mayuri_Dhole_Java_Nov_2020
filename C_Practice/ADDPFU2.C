//Program to perform addtion of two numbers using pointer and
//using function with arguments and no return type
#include<stdio.h>
#include<conio.h>

void sumpointer(int *,int *);

void main()
{
 int a,b,*p,*q;
 clrscr();
 printf("\n Enter two values:");
 scanf("%d%d",&a,&b);
 p=&a;
 q=&b;
 sumpointer(p,q);
 getch();
}

void sumpointer(int *x,int *y)
{
 int sum;
 sum=*x+*y;
 printf("\n Sum of the number is %d",sum);
}
