//C program to find the smallest missing element from a sorted array.
#include<stdio.h>
#include<conio.h>

void main()
{
  int a[]={0,1,3,4,5,6,7,9};
  int i,count,flag=0;
  clrscr();
  count=sizeof(a)/sizeof(a[0]);
  printf("\nNumber of elements in the given array is %d\n",count);
  printf("\nThe given array is\n");
  for(i=0;i<count;i++)
  {
    printf("%d  ",a[i]);
  }
  for(i=0;i<count;i++)
  {
    if(a[i] != i)
    {
      flag=1;
      break;
    }
  }
  if(flag == 1)
  {
    printf("\nThe missing smallest element is %d",i);
  }
  getch();
}