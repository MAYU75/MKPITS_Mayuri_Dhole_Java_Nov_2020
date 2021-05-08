#include<stdio.h>
#include<conio.h>

void main()
{
 int num,total=0,rem,original;
 clrscr();
 printf("\n Enter a positive number less than 500: ");
 scanf("%d",&num);
 original=num;
 if(num<1 || num>500)
 {
  printf("\n The given number is out of range");
 }
 else
 {
  rem=num%10;
  total=total+rem;
  num=num/10;
  rem=num%10;
  total=total+rem;
  num=num/10;
  rem=num%10;
  total=total+rem;
  printf("\n Sum of the digits of %d is %d",original,total);
 }
  getch();
}
