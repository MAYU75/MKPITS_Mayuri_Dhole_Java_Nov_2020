//C program to display the cube of the number upto given an integer.

#include<stdio.h>
#include<conio.h>

void main()
{
 int i,num,cube;
 clrscr();
 printf("\n Enter the number upto which you want to find cube of the numbers: ");
 scanf("%d",&num);
 for(i=1;i<=num;i++)
 {
  cube=i*i*i;
  printf("\n Cube of %d is %d",i,cube);
 }
 getch();
}