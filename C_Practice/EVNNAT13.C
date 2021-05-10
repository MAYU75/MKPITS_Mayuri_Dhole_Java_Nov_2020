//C program to display the n terms of even natural number and their sum.
//for eg.
//Input number of terms: 5
//Expected Output:
//The even numbers are: 2 4 6 8 10
//The sum of even natural number upto 5 terms: 30

#include<stdio.h>
#include<conio.h>

void main()
{
 int n,i,count=0;
 long int sum=0;
 clrscr();
 printf("\n Enter the no. of terms(Maximum limit 250 terms): ");
 scanf("%d",&n);
 printf("\n The %d terms of even natural numbers are : ",n);
 for(i=1;i<500;i++)
 {
  if(count<n)
  {
   if(i%2 == 0)
   {
    printf("  %d",i);
    count++;
    sum=sum+i;
   }
  }
 }
 printf("\n Sum of %d terms of even natural numbers is %ld",n,sum);
 getch();
}
