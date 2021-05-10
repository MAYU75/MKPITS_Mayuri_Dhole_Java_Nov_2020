//C program that takes four numbers as input to calculate and print average
#include<stdio.h>
#include<conio.h>

void main()
{
 int n1,n2,n3,n4;
 float avg;
 clrscr();
 printf("\n Enter the four numbers to calculate average: ");
 scanf("%d%d%d%d",&n1,&n2,&n3,&n4);
 avg=(n1+n2+n3+n4)/4;
 printf("\n Average of four numbers is %.2f",avg);
 getch();
}