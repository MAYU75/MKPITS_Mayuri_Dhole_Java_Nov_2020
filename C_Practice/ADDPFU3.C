//Program to perform addtion of two numbers using pointer and
//using function with arguments and return type
#include<stdio.h>
#include<conio.h>

int sumpointer(int *,int *);

void main()
{
 int a,b,*p,*q,s;
 clrscr();
 printf("\n Enter two values:");
 scanf("%d%d",&a,&b);
 p=&a;
 q=&b;
 s=sumpointer(p,q);
 printf("\n Sum of the number is %d",s);
 getch();
}

int sumpointer(int *x,int *y)
{
 int sum;
 sum=*x+*y;
 return sum;
}
