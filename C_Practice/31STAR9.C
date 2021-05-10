//C program to replace every element with the greatest element on its
//right side
//Expected output:
//The given array is: 7 5 8 9 6 8 5 7 4 6
//After replace the modified array is: 9 9 9 8 8 7 7 6 6 0

#include<stdio.h>
#include<conio.h>

void main()
{
    int i,a[]={7,5,8,9,6,8,5,7,4,6},size,max,temp;
    clrscr();
    size=sizeof(a)/sizeof(a[0]);
    printf("\nThe given array is: ");
    for(i=0;i<size;i++)
    {
      printf("%d ",a[i]);
    }
    max=a[size-1];
    a[size-1]=0;
    for(i=size-2;i>=0;i--)
    {
      temp=a[i];
      a[i]=max;
      if(max<temp)
      {
	max=temp;
      }
    }
    printf("\nAfter replace the modified array is: ");
    for(i=0;i<size;i++)
    {
      printf("%d ",a[i]);
    }
    getch();
}
