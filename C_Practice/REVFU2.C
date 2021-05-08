//Reverse a 3 digit number using function with arguments and no return type
#include<stdio.h>
#include<conio.h>

void reverse(int);

void main()
{
 int num;
 clrscr();
 printf("\n Enter the 3 digit number that you want to reverse:");
 scanf("%d",&num);
 reverse(num);
 getch();
}

void reverse(int n)
{
 int remainder,reverse=0;
 if(n!=0)
 {
  remainder=n%10;
  reverse=(reverse*10)+remainder;
  n=n/10;
 }
 if(n!=0)
 {
  remainder=n%10;
  reverse=(reverse*10)+remainder;
  n=n/10;
 }
 if(n!=0)
 {
  remainder=n%10;
  reverse=(reverse*10)+remainder;
  n=n/10;
 }
 printf("\n The reverse of a 3 digit number is %d",reverse);
}