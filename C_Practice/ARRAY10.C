//C program to find the second smallest element in an array.

#include<stdio.h>
#include<conio.h>

void main()
{
  int a[15],i,j,n,temp;
  clrscr();
  printf("\n Enter the number of elements to be stored in the array: ");
  scanf("%d",&n);
  printf("\n Enter %d elements in the array:\n",n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
      if(a[i] > a[j])
      {
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
      }
    }
  }
  printf("\n Elements of array in sorted ascending order:\n");
  for(i=0;i<n;i++)
  {
    printf("%d\n",a[i]);
  }
  getch();
}