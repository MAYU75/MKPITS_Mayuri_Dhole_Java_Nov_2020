#include<stdio.h>
#include<conio.h>

void main()
{
 int i,num,remainder,reversenum=0,originalnum;
 clrscr();
 printf("\n Enter the 3 digit number to check whether it is palindrone number or not:");
 scanf("%d",&num);
 originalnum=num;
 i=0;
 while(i<3)
 {
 if(num!=0)
 {
  remainder=num%10;
  reversenum=(reversenum*10)+remainder;
  num=num/10;
 }
 i++;
 }
 if(originalnum==reversenum)
 {
 printf("\n %d is a palindrone number.",originalnum);
 }
 else
 {
 printf("\n %d is not a palindrone number.",originalnum);
 }
 getch();
}