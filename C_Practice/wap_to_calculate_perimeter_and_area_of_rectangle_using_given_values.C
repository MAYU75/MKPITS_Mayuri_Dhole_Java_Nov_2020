/*C program to the perimeter and area of rectangle*/
#include<stdio.h>
#include<conio.h>

void main()
{
 int height=7,width=5,perimeter,area;
 clrscr();
 perimeter=2*(height+width);
 area=height*width;
 printf("\n Perimeter of rectangle is %d",perimeter);
 printf("\n Area of rectangle is %d",area);
 getch();
}