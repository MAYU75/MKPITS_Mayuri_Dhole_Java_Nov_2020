#include<stdio.h>
#include<conio.h>

void main()
{
 int i,a[5]={2,4,6,8,9};
 int *p;
 p=&a[0];
 clrscr();
 for(i=1;i<=5;i++)
 {

 printf("\nValue of a: %u ",*p);
 p++;
 }
 //printf("\nAddress of a: %u ",p);
 getch();
}