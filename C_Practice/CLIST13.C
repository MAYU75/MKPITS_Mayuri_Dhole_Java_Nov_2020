//C program to print the odd numbers from 1 to 99. Print one number per line

#include<stdio.h>
#include<conio.h>

void main()
{
 int num;
 clrscr();
 printf("\n Odd numbers from 1 to 99 are: ");
 for(num=1;num<100;num++)
 {
  if(num%2 != 0)
  {
   printf("\n %d",num);
  }
 }
 getch();
}