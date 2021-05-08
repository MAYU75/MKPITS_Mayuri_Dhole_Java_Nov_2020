#include<stdio.h>
#include<conio.h>

void main()
{
 int num[5],i;
 clrscr();
 printf("\nInput the 5 elements of an array:\n");
 for(i=0;i<5;i++)
 {
  scanf("%d",&num[i]);
 }
 for(i=0;i<5;i++)
 {
  if(num[i]<5)
  {
   printf("num[%d]= %d\n",i,num[i]);
  }
 }
 getch();
}
