//C program to display the first n terms of fibonacci series.
//Input number of terms to display: 10
//Expected output:
//Here is fibonacci series upto 10 terms:
//0 1 1 2 3 5 8 13 21 34

#include<stdio.h>
#include<conio.h>

void main()
{
 int num,i,term1=0,term2=1,nextt;
 clrscr();
 printf("\n Enter the number of terms to display in fibonacci series: ");
 scanf("%d",&num);
 printf("\n Fibonacci series upto %d terms is:\n",num);
 for(i=1;i<=num;i++)
 {
  printf("%d\t",term1);
  nextt=term1+term2;
  term1=term2;
  term2=nextt;
 }
getch();
}