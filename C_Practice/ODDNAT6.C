//C program to display the n terms of odd natural number and their sum.

#include<stdio.h>
#include<conio.h>

void main()
{
 int n,i,count=0;
 long int sum=0;
 clrscr();
 printf("\n Enter the no. of terms: ");
 scanf("%d",&n);
 printf("\n The %d terms of odd natural numbers are : ",n);
 for(i=1;i<500;i++)
 {
  if(count<n)
  {
   if(i%2 != 0)
   {
    printf("  %d",i);
    count++;
    sum=sum+i;
   }
  }
 }
 printf("\n Sum of %d terms of odd natural numbers is %ld",n,sum);
 getch();
}
