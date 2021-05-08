#include<stdio.h>
#include<conio.h>

void main()
{
  float inch,cm;
  clrscr();
  printf("\nEnter the distance in cm: ");
  scanf("%f",&cm);
  inch= cm/2.54;
  printf("\nDistance of %0.2f cms is = %0.2f inches",cm,inch);
  getch();
}
