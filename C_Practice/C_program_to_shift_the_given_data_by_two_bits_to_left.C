#include<stdio.h>
#include<conio.h>

void main()
{
int a,b;
clrscr();
printf("\nEnter the integer: ");
scanf("%d",&a);
printf("\nInteger value = %d ",a);
a<<=2;
b=a;
printf("\nThe left shifted integer is = %d ",b);
getch();
}
