//Reverse a 3 digit number using no arguments and no return type
#include<stdio.h>
#include<conio.h>

void reverse();

void main()
{
 clrscr();
 reverse();
 getch();
}

void reverse()
{
 int num,remainder,reverse=0;
 printf("\n Enter the 3 digit number that you want to reverse:");
 scanf("%d",&num);
 if(num!=0)
 {
  remainder=num%10;
  reverse=(reverse*10)+remainder;
  num=num/10;
 }
 if(num!=0)
 {
  remainder=num%10;
  reverse=(reverse*10)+remainder;
  num=num/10;
 }
 if(num!=0)
 {
  remainder=num%10;
  reverse=(reverse*10)+remainder;
  num=num/10;
 }
 printf("\n The reverse of a 3 digit number is %d",reverse);
}