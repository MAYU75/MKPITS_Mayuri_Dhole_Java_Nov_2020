#include<stdio.h>
#include<conio.h>

void main()
{
 int array[6],i,small,position;
 clrscr();
 printf("\nEnter 6 elements of the array:\n ");
 for(i=0;i<6;i++)
 {
  scanf("%d",&array[i]);
 }
 small=array[0];
 position=0;
 for(i=0;i<6;i++)
 {
  if(small>array[i])
  {
   small=array[i];
   position=i;
  }
 }
 printf("\n The smallest element of the array: %d.",small);
 printf("\n Position of the smallest element: %d",position+1);
 getch();
}
