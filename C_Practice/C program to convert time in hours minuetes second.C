#include<stdio.h>
#include<conio.h>
#include<math.h>

void main()
{
 int sec,hr,min,second;
 clrscr();
 printf("\n Enter the time in seconds:");
 scanf("%d",&sec);
 hr=(sec/3600);
 min=(sec-(3600*hr))/60;
 second=(sec-(3600*hr)-(min*60));
 printf("\n Time= %d:%d:%d",hr,min,second);
 getch();
}
