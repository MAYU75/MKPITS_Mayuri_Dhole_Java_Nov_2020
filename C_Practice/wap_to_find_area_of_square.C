#include<stdio.h>
#include<conio.h>
void main()
{
 int side,area_of_square;
 clrscr();
 printf("\n Enter the side of square:");
 scanf("%d",&side);
 area_of_square=side*side;
 printf("\n Area of square= %d",area_of_square);
 getch();
}