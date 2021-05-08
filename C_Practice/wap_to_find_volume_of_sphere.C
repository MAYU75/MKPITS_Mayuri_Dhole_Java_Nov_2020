#include<stdio.h>
#include<conio.h>
void main()
{
 int radius;
 float volume,pi=3.142;
 clrscr();
 printf("\n Enter the value of the radius of the sphere:");
 scanf("%d",&radius);
 volume=(4*pi*radius*radius*radius)/3;
 printf("\n Volume of sphere is %f",volume);
 getch();
}