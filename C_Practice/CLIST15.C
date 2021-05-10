//C program the sum of digits of an integer
#include<stdio.h>
#include<conio.h>

void main()
{
 int i,num,sum=0,rem;
 clrscr();
 printf("\n Enter the 3 digit integer: ");
 scanf("%d",&num);
 for(i=1;i<=3;i++)
 {
  rem=num%10;
  sum=sum+rem;
  num=num/10;
 }
 printf("\n Sum of the 3 digits integer is %d",sum);
 getch();
}