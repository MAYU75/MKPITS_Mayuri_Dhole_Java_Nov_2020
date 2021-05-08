/*C program for sorting*/
#include<stdio.h>
#include<conio.h>

void main()
{
 int i,n,temp,j,arr[25];
 clrscr();
 printf("\n Enter the number of elements you want to enter: ");
 scanf("%d",&n);
 printf("\n Enter the elements: ");
 for(i=0;i<n;i++)
 {
  scanf("%d",&arr[i]);
 }
 for(i=0;i<n;i++)
 {
  for(j=0;j<(n-i-1);j++)
  {
   if(arr[j]>arr[j+1])
   {
    temp=arr[j];
    arr[j]=arr[j+1];
    arr[j+1]=temp;
   }
  }
 }
 printf("\n The sorted array id: ");
 for(i=0;i<n;i++)
 {
  printf("\n %d\t",arr[i]);
 }
 getch();
}