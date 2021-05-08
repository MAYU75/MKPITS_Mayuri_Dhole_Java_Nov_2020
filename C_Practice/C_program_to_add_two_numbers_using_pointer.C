#include<stdio.h>
#include<conio.h>

void main()
{
 int a,b,*p,*q,sum;
 clrscr();
 printf("\n Enter two values:");
 scanf("%d%d",&a,&b);
 p=&a;
 q=&b;
 sum=*p+*q;
 printf("\n Sum of the number is %d",sum);
 getch();
}