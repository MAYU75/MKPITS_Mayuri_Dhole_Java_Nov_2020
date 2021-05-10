//C program to find the missing number from a given array.

#include<stdio.h>
#include<conio.h>

void main()
{
  int a[]={1,3,4,2,5,6,9,8};
  int i,count,sum=0,n,misnum;
  clrscr();
  count=sizeof(a)/sizeof(a[0]);
  n=count+1;
  printf("Number of elements in the given array is %d",count);
  printf("\n The given array is\n");
  for(i=0;i<count;i++)
  {
    printf("%d  ",a[i]);
  }
  for(i=0;i<count;i++)
  {
    sum=sum+a[i];
  }
  misnum=(n*(n+1))/2-sum;
  printf("\n The missing number is %d",misnum);
  getch();
}