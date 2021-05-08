//Reverse a 3 digit number using function with arguments and with return type
#include<stdio.h>
#include<conio.h>

int reverse(int);

void main()
{
 int num,rev;
 clrscr();
 printf("\n Enter the 3 digit number that you want to reverse:");
 scanf("%d",&num);
 rev=reverse(num);
 printf("\n The reverse of a 3 digit number is %d",rev);
 getch();
}

int reverse(int n)
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
 return reverse;
}