#include<stdio.h>
#include<conio.h>

void main()
{
 int num,i;
 clrscr();
 printf("\nEnter an integer: ");
 scanf("%d",&num);
 printf("All the divisor of %d are: ",num);
 for(i=1;i<=num;i++)
 {
  if((num%i)==0)
  {
   printf("\n%d\t",i);
  }
 }
 getch();
}
