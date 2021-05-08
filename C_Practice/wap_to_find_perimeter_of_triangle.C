#include<stdio.h>
#include<conio.h>
void main()
{
 int side1,side2,side3,perimter;
 clrscr();
 printf("\n Enter the value of three sides of the triangle:");
 scanf("%d%d%d",&side1,&side2,&side3);
 perimter=side1+side2+side3;
 printf("\n Perimter of triangle is %d",perimter);
 getch();
}