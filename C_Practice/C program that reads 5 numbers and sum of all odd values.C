#include<stdio.h>
#include<conio.h>

void main()
{
 int j,num1,num2,num3,num4,num5,total=0;
 clrscr();
 printf("\nInput the first number: ");
 scanf("%d",&num1);
 printf("\nInput the second number: ");
 scanf("%d",&num2);
 printf("\nInput the third number: ");
 scanf("%d",&num3);
 printf("\nInput the fourth number: ");
 scanf("%d",&num4);
 printf("\nInput the fifth number: ");
 scanf("%d",&num5);
 if((num1%2) != 0)
 {
   total=total+num1;
 }
 if((num2%2) != 0)
 {
  total=total+num2;
 }
 if((num3%2) != 0)
 {
  total=total+num3;
 }
 if((num4%2) != 0)
 {
  total=total+num4;
 }
 if((num5%2) != 0)
 {
  total=total+num5;
 }
 printf("\nSum of all odd values: %d",total);
 getch();
}
