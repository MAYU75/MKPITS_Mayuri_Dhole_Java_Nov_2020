#include<stdio.h>
#include<conio.h>

void main()
{
 int num,remainder,result=0,originalnum;
 clrscr();
 printf("\n Enter the 3 digit number to check whether it is armstrong number or not:");
 scanf("%d",&num);
 originalnum=num;
 if(num!=0)
 {
  remainder=num%10;
  result=(result+(remainder*remainder*remainder));
  num=num/10;
 }
 if(num!=0)
 {
  remainder=num%10;
  result=(result+(remainder*remainder*remainder));
  num=num/10;
 }
 if(num!=0)
 {
  remainder=num%10;
  result=(result+(remainder*remainder*remainder));
  num=num/10;
 }
 if(result==originalnum)
 {
 printf("\n %d is an armstrong number.",originalnum);
 }
 else
 {
 printf("\n %d is not an armstrong number.",originalnum);
 }
 getch();
}