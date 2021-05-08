#include<stdio.h>
#include<conio.h>
void main()
{
 int radius,height;
 float area,pi=3.142;
 clrscr();
 printf("\n Enter the value of radius and height of the right cylinder:");
 scanf("%d%d",&radius,&height);
 area=(2*pi*radius*height)+(2*pi*radius*radius);
 printf("\n Area of right cylinder is %f",area);
 getch();
}