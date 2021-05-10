//C program to find largest of three numbers.

#include<stdio.h>
#include<conio.h>

void main()
{
 int a,b,c;
 clrscr();
 printf("\n Enter the three numbers: ");
 scanf("%d%d%d",&a,&b,&c);
 if(a>b && a>c)
   printf("\n %d is the largest number.",a);
 else if(b>a && b>c)
	printf("\n %d is the largest number.",b);
      else
	printf("\n %d is the largest number.",c);
 getch();
}