#include<stdio.h>
#include<conio.h>

void main()
{
 int numbers[5],i,positive=0,negative=0;
 clrscr();
 for(i=0;i<5;i++)
 {
  printf("\nEnter the %d number: ",i+1);
  scanf("%d",&numbers[i]);
 }
 for(i=0;i<5;i++)
 {
  if(numbers[i]>0)
  {
   positive++;
  }
  else
  {
   negative++;
  }
 }
 printf("\nNumber of positive numbers: %d",positive);
 printf("\nNumber of negative numbers: %d",negative);
 getch();
}
