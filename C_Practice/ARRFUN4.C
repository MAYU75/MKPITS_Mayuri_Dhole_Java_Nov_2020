//Program to find largest number from the given array using
//function with no arguments and with return type
#include<stdio.h>
#include<conio.h>

int arrayl();

void main()
{
 int l;
 clrscr();
 l=arrayl();
 printf("\n The largest element is %d",l);
 getch();
}

int arrayl()
{
 int array[50],num,i,large;
 printf("\n How many elements you want to enter: ");
 scanf("%d",&num);
 printf("\n Enter the %d elements: ",num);
 for(i=0;i<num;i++)
 {
  scanf("%d",&array[i]);
 }
 large=array[0];
 for(i=1;i<num;i++)
 {
  if(array[i]>large)
  {
   large=array[i];
  }
 }
 return large;
}