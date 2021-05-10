//C program to compute the sum of the first 500 prime numbers.

#include<stdio.h>
#include<conio.h>

void main()
{
 int num,i,count,a=0;
 long int sum=0;
 clrscr();
 printf("\n The first 500 prime numbers are: ");
 for(num=1;num<=3580;num++)
 {
  if(a<500)
  {
   count=0;
   for(i=2;i<=num/2;i++)
   {
    if(num%i == 0)
    {
     count++;
     break;
    }
   }
   if(count==0 && num!=1)
   {
    a++;
    printf("  %d",num);
    sum=sum+num;
   }
  }
 }
 printf("\n Sum of first 500 prime numbers= %ld",sum);
 getch();
 }
