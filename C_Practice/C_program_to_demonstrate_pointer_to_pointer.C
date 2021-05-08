//Pointer to pointer
#include<stdio.h>
#include<conio.h>

void main()
{
 int a=5;
 int *p,**ptr,***pt;
 p=&a;
 ptr=&p;
 pt=&ptr;
 clrscr();
 printf("\n Value of a: %d",a);
 printf("\n Value of a: %d",*p);
 printf("\n Value of a: %d",**ptr);
 printf("\n Address of a: %u",p);
 printf("\n Address of p: %u",ptr);
 printf("\n Address of ptr: %u",pt);
 printf("\n Address of a: %u",*&p);
 printf("\n Address of p: %u",*&ptr);
 getch();
}

