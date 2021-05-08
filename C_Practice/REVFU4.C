//Reverse a 3 digit number using function with no arguments and with return type
#include<stdio.h>
#include<conio.h>

int reverse();

void main()
{
 int rev;
 clrscr();
 rev=reverse();
 printf("\n The reverse of a 3 digit number is %d",rev);
 getch();
}

int reverse()
{
 int remainder,reverse=0;
 int n;
 printf("\n Enter the 3 digit number that you want to reverse:");
 scanf("%d",&n);

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
 return reverse;
}