#include<stdio.h>
#include<conio.h>

void main()
{
 int i;
 clrscr();
 printf("\nEven numbers between 1 to 50 (inclusive) are:\n ");
 for(i=1;i<=50;i++)
 {
  if(i%2==0)
  {
   printf("%d\t",i);
  }
 }
 getch();
}
