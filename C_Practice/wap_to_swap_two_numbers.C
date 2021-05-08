#include<stdio.h>
#include<conio.h>
void main()
{
 int a,b,c;
 clrscr();
 printf("\n Enter two numbers that needs to swapped:");
 scanf("%d%d",&a,&b);
 printf("\n Before swapping");
 printf("\n a=%d and b=%d",a,b);
 a=b;
 b=c;
 c=a;
 printf("\n After swapping");
 printf("\n a=%d and b=%d",a,b);