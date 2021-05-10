//C program to display the n terms of square natural number and their sum.
//1 4 9 16......n terms
//Test Data:
//Input number of terms: 5
//Expected Output:
//The square natural upto 5 terms are: 1 4 9 16 25
//The sum of square natural number upto 5 terms: 55

#include<stdio.h>
#include<conio.h>

void main()
{
 int n,i,square;
 long int sum=0;
 clrscr();
 printf("\n Enter the no. of terms: ");
 scanf("%d",&n);
 printf("\n The squares of %d terms of natural numbers are :\n ",n);
 for(i=1;i<=n;i++)
 {
  square=i*i;
  printf("\t%d",square);
  sum=sum+square;
 }
 printf("\n Sum of squares of %d terms of natural numbers is %ld",n,sum);
 getch();
}
