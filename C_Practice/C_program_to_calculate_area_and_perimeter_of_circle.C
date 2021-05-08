#include<stdio.h>
#include<conio.h>
void main()
{
 int radius=6;
 float pi=3.142,area,perimeter;
 clrscr();
 area=pi*radius*radius;
 perimeter=(2*pi*radius);
 printf("\n Area of circle=%f",area);
 printf("\n Perimeter of circle=%f",perimeter);
 getch();
}