//C program to copy the elements of one array into another array.

#include<stdio.h>
#include<conio.h>

void main()
{
  int i,n,arr1[25],arr2[25];
  clrscr();
  printf("\n Enter the number of elements to be stored in array: ");
  scanf("%d",&n);
  printf("\n Enter %d elements in the array:\n",n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr1[i]);
  }
  for(i=0;i<n;i++)
  {
    arr2[i]=arr1[i];
  }
  printf("\n The elements stored in the first array are:\n");
  for(i=0;i<n;i++)
  {
    printf("%d\t",arr1[i]);
  }
  printf("\n The elements stored in the second array are:\n");
  for(i=0;i<n;i++)
  {
    printf("%d\t",arr2[i]);
  }
  getch();
}
