#include<stdio.h>
#include<conio.h>
void main()
{
 int length,breadth,perimter;
 clrscr();
 printf("\n Enter the length and breadth of the rectangle:");
 scanf("%d%d",&length,&breadth);
 perimter=2*(length+breadth);
 printf("\n Perimter of rectangle is %d",perimter);
 getch();
}