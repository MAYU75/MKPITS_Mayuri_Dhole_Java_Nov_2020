//C program to check whether a number is a strong number or not.
//Input a number to check whether it is strong number: 15
//Expected output:
//15 is not a strong number.
//145. 1!=1, 4!=24, 5!=120. 1+24+120=145. 145 is a strong number.

#include<stdio.h>
#include<conio.h>

void main()
{
 int num,i,j,fact=1,sum=0,orinum,rem;
 clrscr();
 printf("\n Enter the number: ");
 scanf("%d",&num);
 orinum=num;
 for(i=0;i<3;i++)
 {
  fact=1;
  if(num != 0)
  {
   rem=num%10;
   for(j=1;j<=rem;j++)
   {
    fact=fact*j;
   }
   sum=sum+fact;
   num=num/10;
  }
 }
 if(orinum == sum)
 {
  printf("\n %d is a strong number.",orinum);
 }
 else
 {
  printf("\n %d is not a strong number.",orinum);
 }
 getch();
}