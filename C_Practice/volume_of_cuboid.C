#include<stdio.h>
#include<conio.h>
void main()
{
 int length,breadth,height,volume;
 clrscr();
 printf("\n Enter the length,breadth and height of the cuboid:");
 scanf("%d%d%d",&length,&breadth,&height);
 volume=(length*breadth*height);
 printf("\n Volume of cuboid is %d",volume);
 getch();
}