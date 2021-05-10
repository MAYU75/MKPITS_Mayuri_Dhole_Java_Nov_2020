//C program to read 10 numbers from keyboard and find their sum and average

#include<stdio.h>
#include<conio.h>

void main()
{
 int i,num,sum=0;
 float average;
 clrscr();
 printf("\n Enter 10 numbers: ");
 for(i=0;i<10;i++)
 {
  scanf("%d",&num);
  sum=sum+num;
 }
 printf("\n Sum of 10 numbers is %d",sum);
 average=(float) sum/10;
 printf("\n Average of 10 numbers is %.2f",average);
 getch();
}