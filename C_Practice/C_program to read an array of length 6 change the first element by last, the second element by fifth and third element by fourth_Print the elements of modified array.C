#include<stdio.h>
#include<conio.h>

void main()
{
 int array[6],i,temp;
 clrscr();
 printf("\nEnter 6 elements of the array:\n");
 for(i=0;i<6;i++)
 {
  scanf("%d",&array[i]);
 }
 for(i=0;i<6;i++)
 {
  if(i<(6/2))
  {
  temp=array[i];
  array[i]=array[6-(i+1)];
  array[6-(i+1)]=temp;
  }
 }
 for(i=0;i<6;i++)
 {
  printf("array[%d] = %d\n",i,array[i]);
 }
 getch();
}
