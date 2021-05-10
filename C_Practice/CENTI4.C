//C program to read temperature in centigrade and display a suitable message

#include<stdio.h>
#include<conio.h>

void main()
{
 int centi;
 clrscr();
 printf("\n Enter the temperature in centigrade: ");
 scanf("%d",&centi);
 if(centi<0)
   printf("\n Weather is freezing.");
 else if(centi>=0 && centi<10)
	printf("\n Weather is very cold.");
      else if(centi>=10 && centi<20)
	     printf("\n Weather is cold.");
	   else if(centi>=20 && centi<30)
		  printf("\n Weather is normal.");
		else if(centi>=30 && centi<40)
		       printf("\n Weather is hot.");
		     else
		       printf("\n Weather is very hot.");
 getch();
}