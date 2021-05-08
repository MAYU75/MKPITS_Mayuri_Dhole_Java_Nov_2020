#include<stdio.h>
#include<conio.h>

void main()
{
 int no_of_days;
 int years,weeks,days;
 clrscr();
 printf("\nEnter number of days:");
 scanf("%d",&no_of_days);
 years=no_of_days/365;
 weeks=(no_of_days%365)/7;
 days=no_of_days-((years*365)+(weeks*7));
 printf("\nNo. of years:",years);
 Printf("\nNo. of weeks:",weeks);
 printf("\nNo. of days:",days);
 getch();
}