#include<stdio.h>
#include<conio.h>

void main()
{
 int i,num,remainder,reverse=0;
 clrscr();
 printf("\n Enter the 3 digit number that you want to reverse:");
 scanf("%d",&num);
 i=1;
 while(i<=3)
 {
 if(num!=0)
 {
  remainder=num%10;
  reverse=(reverse*10)+remainder;
  num=num/10;
 }
 i++;
 }
 printf("\n The reverse of a 3 digit number is %d",reverse);
 getch();
}