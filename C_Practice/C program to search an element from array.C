/*C program for Searching an element*/
#include<stdio.h>
#include<conio.h>

void main()
{
 int i,array[100],search,num;
 clrscr();
 printf("\n Enter number of elements in array: ");
 scanf("%d",&num);
 printf("\n Enter %d integers: ",num);
 for(i=0;i<num;i++)
 {
  scanf("%d",&array[i]);
 }
 printf("\n Enter a number to search: ");
 scanf("%d",&search);
 for(i=0;i<num;i++)
 {
  if(array[i]==search)
  {
   printf("\n %d is present at location %d.",search,i+1);
   break;
  }
 }
 if(i==num)
 printf("\n %d is not present in the array.",search);
 getch();
}
