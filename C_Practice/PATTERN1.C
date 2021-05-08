#include<stdio.h>
#include<conio.h>

void main()
{
 int i,j;
 clrscr();
 for(i=1;i<=3;i++)
 {
  for(j=1;j<=4;j++)
  {
   printf("%d\t",j);
  }
  printf("\n%d",i);
 }
 getch();
}