#include<stdio.h>
#include<conio.h>

void main()
{
 int num,count=0,min,max,sum=0;
 float avg;
 clrscr();
 printf("\n Enter a positive integer: ");
 scanf("%d",&num);
 if(num<=0)
 {
  printf("\n The number entered is not a positive number.");
 }
 else
 {
 min=num;
 max=num;
 while(num>0)
 {
  sum=sum+num;
  count++;
  if(num>max)
  {
   max=num;
  }
  if(num<min)
  {
   min=num;
  }
  printf("\n Enter next positive integer: ");
  scanf("%d",&num);
 }
 }
 avg=(float) sum/(float) count;
 printf("\n Total number of positive values entered is %d",count);
 printf("\n Maximum value entered is %d",max);
 printf("\n Minimum value entered is %d",min);
 printf("\n Average of all values entered is %f",avg);
 getch();
}

