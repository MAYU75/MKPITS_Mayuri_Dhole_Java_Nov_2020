//C program to find the two repeating elements in a given array.
//Expected output:
//The given array is: 2  7  4  7  8  3  4
//The repeating elements are: 7  4

#include<stdio.h>
#include<conio.h>

void main()
{
  int a[]={2,7,4,7,8,3,4};
  int count,i,j;
  clrscr();
  count=sizeof(a)/sizeof(a[0]);
  printf("\nThe given array is : ");
  for(i=0;i<count;i++)
  {
    printf("%d  ",a[i]);
  }
  printf("\nThe repeating elements are: ");
  for(i=0;i<count;i++)
  {
    for(j=i+1;j<count;j++)
    {
      if(a[i] == a[j])
      {
	printf("%d ",a[i]);
      }
    }
  }
  getch();
}
