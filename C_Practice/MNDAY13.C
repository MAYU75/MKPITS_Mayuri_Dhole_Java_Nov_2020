//C program to read any month number in integer and display month name
//in word.

#include<stdio.h>
#include<conio.h>

void main()
{
 int mon;
 clrscr();
 printf("\n Enter the month number: ");
 scanf("%d",&mon);
 switch(mon)
 {
  case 1: printf("\n Month is January. It has 31 days.");
	  break;
  case 2: printf("\n Month is February. It has 28/29 days.");
	  break;
  case 3: printf("\n Month is March. It has 31 days.");
	  break;
  case 4: printf("\n Month is April. It has 30 days.");
	  break;
  case 5: printf("\n Month is May. It has 31 days.");
	  break;
  case 6: printf("\n Month is June. It has 30 days.");
	  break;
  case 7: printf("\n Month is July. It has 31 days.");
	  break;
  case 8: printf("\n Month is August. It has 31 days.");
	  break;
  case 9: printf("\n Month is September. It has 30 days.");
	  break;
  case 10: printf("\n Month is October. It has 31 days.");
	  break;
  case 11: printf("\n Month is November. It has 30 days.");
	  break;
  case 12: printf("\n Month is December. It has 31 days.");
	  break;
  default: printf("\n Wrong choice.");
 }
 getch();
}
