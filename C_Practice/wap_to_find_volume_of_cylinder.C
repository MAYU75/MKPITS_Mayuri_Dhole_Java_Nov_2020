#include<stdio.h>
#include<conio.h>
void main()
{
 int radius,height;
 float volume,pi=3.142;
 clrscr();
 printf("\n Enter the value of radius and height of the cylinder:");
 scanf("%d%d",&radius,&height);
 volume=pi*radius*radius*height;
 printf("\n Volume of cylinder is %f",volume);
 getch();
}