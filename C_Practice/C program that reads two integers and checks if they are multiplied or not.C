#include<stdio.h>
#include<conio.h>

void main()
{
 int x,y,temp;
 clrscr();
 printf("\nInput the first number: ");
 scanf("%d",&x);
 printf("\nInput the second number: ");
 scanf("%d",&y);
 if(x>y)
 {
  temp=x;
  x=y;
  y=temp;
 }
 if((y%x)==0)
 {
  printf("\nThe numbers can be multiplied.");
 }
 else
 {
  printf("\nThe numbers cannot be multiplied.");
 }
 getch();
}
