//Function with no return type and no arguments
#include<stdio.h>
#include<conio.h>

void areacircle();

void main()
{
 clrscr();
 areacircle();
 getch();
}

void areacircle()
{
 float r,pi=3.142,area;
 printf("\n Enter the value of the radius: ");
 scanf("%f",&r);
 area=pi*r*r;
 printf("\n Area of circle is %f",area);
}