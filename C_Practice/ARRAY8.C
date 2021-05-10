//C program to find the maximum and minimum element in an array.

#include<stdio.h>
#include<conio.h>

void main()
{
 int a[50];
 int i,n,max,min;
 clrscr();
 printf("\n How many elements you want to enter: ");
 scanf("%d",&n);
 printf("\n Enter the %d elements: ",n);
 for(i=0;i<n;i++)
 {
  scanf("%d",&a[i]);
 }
 max=min=a[0];
 for(i=1;i<n;i++)
 {
  if(a[i]>max)
  {
   max=a[i];
  }
  if(a[i]<min)
  {
   min=a[i];
  }
 }
 printf("\n The maximum element is %d",max);
 printf("\n The minimum element is %d",min);
 getch();
}
