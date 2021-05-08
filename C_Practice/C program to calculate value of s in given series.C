#include<stdio.h>
#include<conio.h>

void main()
{
 float i;
 float sum=0.0;
 clrscr();
 for(i=1;i<=50;i++)
 {

  sum=sum+1/i;
 }

 printf("\nSum is %f",sum);
 getch();
}
