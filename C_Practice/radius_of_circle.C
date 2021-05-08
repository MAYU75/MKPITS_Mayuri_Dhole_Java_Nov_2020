#include<stdio.h>
#include<conio.h>
void main()
{
 int radius;
 float area;
 clrscr();
 printf("\n Enter the radius of the circle:");
 scanf("%d",&radius);
 area=3.14*radius*radius;
 printf("\n Area of circle is %f",area);
 getch();
}