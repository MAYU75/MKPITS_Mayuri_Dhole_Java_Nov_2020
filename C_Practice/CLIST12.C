//C program to convert from celsius degrees to kelvin and fahrenheit.
#include<stdio.h>
#include<conio.h>

void main()
{
 float cel,kel,fah;
 clrscr();
 printf("\n Enter the temperature in celsius degree: ");
 scanf("%f",&cel);
 fah=cel*1.8+32;
 printf("\n The entered celsius temperature in fahrenheit is %.2f",fah);
 kel=cel+273.15;
 printf("\n The entered celsius temperature in kelvin is %.2f",kel);
 getch();
}
