//Program to find largest and smallest number from the given array using
//function with arguments and no return type
#include<stdio.h>
#include<conio.h>

void arraysl(int);

void main()
{
 int num;
 clrscr();
 printf("\n How many elements you want to enter: ");
 scanf("%d",&num);
 arraysl(num);
 getch();
}

void arraysl(int n)
{
 int a[50],i,large,small;
 printf("\n Enter the %d elements: ",n);
 for(i=0;i<n;i++)
 {
  scanf("%d",&a[i]);
 }
 large=small=a[0];
 for(i=1;i<n;i++)
 {
  if(a[i]>large)
  {
   large=a[i];
  }
  if(a[i]<small)
  {
   small=a[i];
  }
 }
 printf("\n The largest element is %d",large);
 printf("\n The smallest element is %d",small);
}