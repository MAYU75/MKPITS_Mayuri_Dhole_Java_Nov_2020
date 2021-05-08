#include<stdio.h>
#include<conio.h>

void main()
{
 int num,remainder,reverse=0;
 clrscr();
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
 getch();
}