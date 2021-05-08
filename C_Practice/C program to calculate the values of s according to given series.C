#include<stdio.h>
#include<conio.h>

void main()
{
 float sum=0,j=1,quotient,i;
 clrscr();
 for(i=1;i<=7;i=i+2)
 {
  quotient=(i/j);
  sum=sum+quotient;
  j=j*2;
 }
 printf("Value of series: %f",sum);
 getch();
}
