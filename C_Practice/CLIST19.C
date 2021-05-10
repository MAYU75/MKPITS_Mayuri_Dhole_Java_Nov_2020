//C program to find whether a given year is a leap year or not.
#include<stdio.h>
#include<conio.h>

void main()
{
 int yr;
 clrscr();
 printf("\n Enter the year to check whether it is leap year or not: ");
 scanf("%d",&yr);
 if(yr%400 == 0)
  printf("\n %d is a leap year.",yr);
 else if(yr%100 == 0)
	 printf("\n %d is not a leap year.",yr);
      else if(yr%4 == 0)
	     printf("\n %d is a leap year.",yr);
	   else
	     printf("\n %d is not a leap year.",yr);
 getch();
}

