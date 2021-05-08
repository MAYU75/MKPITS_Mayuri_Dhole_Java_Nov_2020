//Funtion with arguments and no return type for calculating area of circle
#include<stdio.h>
#include<conio.h>

void areacircle(float,float);

void main()
{
 float r,pi=3.142;
 clrscr();
 printf("\n Enter the value of the radius: ");
 scanf("%f",&r);
 areacircle(r,pi);
 getch();
}

void areacircle(float radius,float pii)
{
 float area;
 area=pii*radius*radius;
 printf("\n Area of circle is %f",area);
}