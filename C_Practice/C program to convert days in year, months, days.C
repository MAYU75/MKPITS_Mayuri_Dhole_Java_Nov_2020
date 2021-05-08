#include<stdio.h>
#include<conio.h>

void main()
{
 int noofdays,yr,mon,days;
 clrscr();
 printf("\n Enter the number of days:");
 scanf("%d",&noofdays);
 yr=noofdays/365;
 noofdays=noofdays-(365*yr);
 mon=noofdays/30;
 days=noofdays-(mon*30);
 printf("\n Total= %d years, %d months, %d days",yr,mon,days);
 getch();
}
