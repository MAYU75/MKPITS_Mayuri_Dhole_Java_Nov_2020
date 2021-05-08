#include<stdio.h>
#include<conio.h>
void main()
{
 int base,height;
 float area;
 clrscr();
 printf("\n Enter the base and height:");
 scanf("%d%d",&base,&height);
 area=(base*height)/2;
 printf("\n Area of triangle is %f",area);
 getch();
}