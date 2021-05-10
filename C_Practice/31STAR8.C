//C program to move all zeroes to the end of a given array.
//Expected output:
//The given array is: 2 5 7 0 4 0 7 -5 8 0
//The new array is:
//2 5 7 8 4 -5 7 0 0 0

#include<stdio.h>
#include<conio.h>

void main()
{
   int a[]={2,5,7,0,4,0,7,-5,8,0},size,i,temp,left=0,right;
   clrscr();
   size=sizeof(a)/sizeof(a[0]);
   right=size-1;
   printf("\nThe given array is :  ");
   for(i=0;i<size;i++)
   {
     printf("%d  ",a[i]);
   }
   while(right>left)
   {
     while(a[left] != 0)
     {
       left++;
     }
     while(a[right] == 0)
     {
       right--;
     }
     if(left<right)
     {
       temp=a[left];
       a[left]=a[right];
       a[right]=temp;
     }
   }
   printf("\nThe new array is: ");
   for(i=0;i<size;i++)
   {
     printf("%d ",a[i]);
   }
   getch();
}
