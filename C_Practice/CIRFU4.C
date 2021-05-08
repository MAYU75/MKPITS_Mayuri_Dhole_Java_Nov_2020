//Funtion with no arguments and with return type for calculating area of circle
#include<stdio.h>
#include<conio.h>

float areacircle();

void main()
{
 float areac;
 clrscr();
 areac=areacircle();
 printf("\n Area of circle is %f",areac);
 getch();
}

float areacircle()
{
 float r,pi=3.142,area;
 printf("\n Enter the value of the radius: ");
 scanf("%f",&r);
 area=pi*r*r;
 return(area);
}