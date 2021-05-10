//C program to make such a pattern like a pyramid with an asterisk
/*
     *
     ***
     ****      */

#include<stdio.h>
#include<conio.h>

void main()
{
 int i,j;
 clrscr();
 for(i=1;i<=5;i++)
 {
  for(j=1;j<=i;j++)
  {
   if(i%2 != 0)
   {
    printf("*");
   }
  }
  printf("\n");
 }
 getch();
}