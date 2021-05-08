//Funtion with arguments and with return type for calculating area of circle
#include<stdio.h>
#include<conio.h>

float areacircle(float,float);

void main()
{
 float r,pi=3.142,areac;
 clrscr();
 printf("\n Enter the value of the radius: ");
 scanf("%f",&r);
 areac=areacircle(r,pi);
 printf("\n Area of circle is %f",areac);
 getch();
}

float areacircle(float radius,float pii)
{
 float area;
 area=pii*radius*radius;
 return(area);
}