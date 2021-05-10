//C program to count a total number of duplicate elements in an array.

#include<stdio.h>
#include<conio.h>

void main()
{
  int i,j,n,arr1[25],arr2[25],arr3[25],count=0,a=1;
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
    arr3[i]=0;
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      if(arr1[i]==arr2[j])
      {
	arr3[j]=a;
	a++;
      }
    }
    a=1;
  }
  for(i=0;i<n;i++)
  {
    if(arr3[i]==2)
    {
      count++;
    }
  }
  printf("\n Total number of duplicate elements found in the array is %d",count);
  getch();
}
