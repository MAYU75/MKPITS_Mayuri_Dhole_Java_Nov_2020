#include<stdio.h>
#include<conio.h>
void main()
{
 int principal,time_period;
 float rate_of_interest,simple_interest;
 clrscr();
 printf("\n Enter the principal,rate of interest and time period:");
 scanf("%d%f%d",&principal,&rate_of_interest,&time_period);
 simple_interest=(principal*rate_of_interest*time_period)/100;
 printf("\n Simple Interest=%f",simple_interest);
 getch();
}