//C program to display the pattern like right triangle with a number
/*   1
     12
     123
     1234      */

#include<stdio.h>
#include<conio.h>

void main()
{
 int i,j;
 clrscr();
 for(i=1;i<=4;i++)
 {
  for(j=1;j<=i;j++)
  {
   printf("%d",j);
  }
  printf("\n");
 }
 getch();
}