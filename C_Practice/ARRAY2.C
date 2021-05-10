//C program to read n number of values in an array and display it
//in reverse order.
//Test Data:
//Input the number of elements to store in the array: 3
//Input 3 number of elements in the array:
//element-0:2
//element-1:5
//element-2:7
//Expected output:
//The values store into the array are:
//2 5 7
//The values store into the array in reverse are:
//7 5 2

#include<stdio.h>
#include<conio.h>

void main()
{
  int n,arr[25],i;
  clrscr();
  printf("\n Input the number of elements to store in the array: ");
  scanf("%d",&n);
  printf("\n Input %d number of elements in the array: ",n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  printf("\n The values store into the array are:\n");
  for(i=0;i<n;i++)
  {
    printf("%d\t",arr[i]);
  }
  printf("\n The values store into the array in reverse are:\n");
  for(i=n-1;i>=0;i--)
  {
    printf("%d\t",arr[i]);
  }
  getch();
}


