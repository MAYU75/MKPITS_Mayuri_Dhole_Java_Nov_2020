//C program to read any day number in integer and display day name in word.

#include<stdio.h>
#include<conio.h>

void main()
{
 int num;
 clrscr();
 printf("\n Enter a number from 1 to 7: ");
 scanf("%d",&num);
 switch(num)
 {
  case 1: printf("\n Monday");
	  break;
  case 2: printf("\n Tuesday");
	  break;
  case 3: printf("\n Wednesday");
	  break;
  case 4: printf("\n Thursday");
	  break;
  case 5: printf("\n Friday");
	  break;
  case 6: printf("\n Saturday");
	  break;
  case 7: printf("\n Sunday");
	  break;
  default: printf("\n Wrong choice.");
 }
 getch();
}
