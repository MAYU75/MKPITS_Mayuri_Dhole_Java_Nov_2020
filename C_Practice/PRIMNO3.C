//C program to find the prime numbers within a range of numbers.
//Input starting number of range: 1
//Input ending number of range: 50
//Expected Output:
//The prime number between 1 and 50 are:
//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47

#include<stdio.h>
#include<conio.h>

void main()
{
 int start,end,i,num,flag=0;
 clrscr();
 printf("\n Enter starting number of the range: ");
 scanf("%d",&start);
 printf("\n Enter ending number of the range: ");
 scanf("%d",&end);
 printf("\n The prime number between %d and %d are:\n",start,end);
 for(num=start;num<=end;num++)
 {
  flag=0;
  for(i=2;i<=num/2;i++)
  {
   if(num%i==0)
   {
    flag=1;
    break;
   }
  }
  if(flag==0 && num!=1)
  {
   printf("\t%d",num);
  }
 }
 getch();
}
