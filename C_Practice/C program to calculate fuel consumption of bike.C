#include<stdio.h>
#include<conio.h>

void main()
{
 int distance;
 float fuelconsumped,average;
 clrscr();
 printf("\nEnter the distance covered by bike:");
 scanf("%d",&distance);
 printf("\n Enter the fuel consumped by bike:");
 scanf("%f",&fuelconsumped);
 average=distance/fuelconsumped;
 printf("\n Bike's average consumption: %f",average);
 getch();
}