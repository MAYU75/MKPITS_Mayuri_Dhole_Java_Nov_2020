#include<stdio.h>
#include<conio.h>

void main()
{
 int num[7],i,x;
 clrscr();
 printf("\nInput the 7 elements of an array:\n ");
 for(i=0;i<7;i++)
 {
  scanf("%d",&x);
  if(x>0)
  {
   num[i]=x;
  }
  else
  {
   num[i]=100;
  }
 }
 printf("\nThe updated elements of array are: \n");
 for(i=0;i<7;i++)
 {
  printf("\nn[%d] = %d",i,num[i]);
 }
 getch();
}
