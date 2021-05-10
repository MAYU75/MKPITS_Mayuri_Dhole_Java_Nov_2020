//C program to store elements in an array and print it.
#include<stdio.h>
#include<conio.h>

void main()
{
  int arr[10],i;
  clrscr();
  printf("\n Enter 10 elements in an array:");
  for(i=0;i<10;i++)
  {
    scanf("%d",&arr[i]);
  }
  printf("Following are the 10 elements in an array:\n");
  for(i=0;i<10;i++)
  {
    printf("%d\t",arr[i]);
  }
  getch();
}