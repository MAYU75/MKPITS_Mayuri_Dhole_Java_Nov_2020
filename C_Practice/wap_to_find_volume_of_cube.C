#include<stdio.h>
#include<conio.h>
void main()
{
 int side,volume;
 clrscr();
 printf("\n Enter the side of the cube:");
 scanf("%d",&side);
 volume=side*side*side;
 printf("\n Volume of cube is %d",volume);
 getch();
}