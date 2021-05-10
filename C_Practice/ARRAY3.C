//C program to find the sum of all elements of the array.
#include<stdio.h>
#include<conio.h>

void main()
{
  int i,n,arr[25],sum=0;
  clrscr();
  printf("\n Enter the number of elements to be stored in array: ");
  scanf("%d",&n);
  printf("\n Enter %d elements in the array:\n",n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
    sum=sum+arr[i];
  }
  printf("\n Sum of %d elements stored in the array is %d",n,sum);
  getch();
}
