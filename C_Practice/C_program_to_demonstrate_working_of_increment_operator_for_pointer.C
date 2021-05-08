#include<stdio.h>
#include<conio.h>

void main()
{
 int a=5;
 int *p;
 p=&a;
 clrscr();
 printf("\nValue of a: %d ",a);
 a++;
 printf("\nValue of a: %d ",a);
 printf("\nAddress of a: %u ",p);
 p++;
 printf("\nAddress of a: %u ",p);
 getch();
}