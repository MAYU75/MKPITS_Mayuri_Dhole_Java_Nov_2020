#include<stdio.h>
#include<conio.h>

void main()
{
 int i,j,flag,count=0;
 clrscr();
 printf("\n The prime numbers between 1 and 200 are:\n ");
 for(i=2;i<200;i++)
 {
  flag=1;
  for(j=2;j<=i/2;j++)
  {
   if(i%j==0)
   {
    flag = 0;
   }
  }
  if(flag==1)
  {
   printf("%d\t",i);
   count++;
  }
 }
 getch();
}
