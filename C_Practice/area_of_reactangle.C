#include<stdio.h>
#include<conio.h>
void main()
{
 int length,breadth,area;
 clrscr();
 printf("\n Enter the length and breadth of the rectangle:");
 scanf("%d%d",&length,&breadth);
 area=length*breadth;
 printf("\n Area of rectangle is %d",area);
 getch();
}