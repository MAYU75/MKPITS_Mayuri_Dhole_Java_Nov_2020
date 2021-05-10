//C program to display the pattern like right triangle with number
//increased by 1.
/*   1
     23
     456
     78910      */

#include<stdio.h>
#include<conio.h>

void main()
{
 int i,j,num=1;
 clrscr();
 for(i=1;i<=4;i++)
 {
  for(j=1;j<=i;j++)
  {
   printf("%d ",num);
   num++;
  }
  printf("\n");
 }
 getch();
}