#include<stdio.h>
#include<conio.h>
void main()
{
 int base,height,area;
 clrscr();
 printf("\n Enter the base and height of the parallelogram:");
 scanf("%d%d",&base,&height);
 area=base*height;
 printf("\n Area of parallelogram is %d",area);
 getch();
}