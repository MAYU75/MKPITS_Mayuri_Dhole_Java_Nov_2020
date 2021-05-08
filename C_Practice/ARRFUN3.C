//Program to find largest number from the given array using
//function with arguments and return type
#include<stdio.h>
#include<conio.h>

int arrayl(int a[],int);

void main()
{
 int array[50],num,l,i;
 clrscr();
 printf("\n How many elements you want to enter: ");
 scanf("%d",&num);
 printf("\n Enter the %d elements: ",num);
 for(i=0;i<num;i++)
 {
  scanf("%d",&array[i]);
 }
 l=arrayl(array,num);
 printf("\n The largest element is %d",l);
 getch();
}

int arrayl(int a[],int n)
{
 int i,large;
 large=a[0];
 for(i=1;i<n;i++)
 {
  if(a[i]>large)
  {
   large=a[i];
  }
 }
 return large;
}