//C program to find majority element of an array.
//Expected output:
//The given array is: 1 3 3 7 4 3 2 3 3
//The majority of the element is: 3

#include<stdio.h>
#include<conio.h>

void main()
{
    int a[]={1,3,3,7,4,3,2,3,3},i,size,count=1,indexofmaj=0;
    clrscr();
    size=sizeof(a)/sizeof(a[0]);
    printf("\nThe given array is: ");
    for(i=0;i<size;i++)
    {
      printf("%d ",a[i]);
    }
    for(i=1;i<size;i++)
    {
      if(a[indexofmaj] == a[i])
	{
	   count++;
	}
      else
	{
	   count--;
	}
      if(count == 0)
	{
	  indexofmaj=i;
	  count=1;
	}
    }
    count=0;
    for(i=0;i<size;i++)
    {
      if(a[i] == a[indexofmaj])
	 {
	   count++;
	 }
 }
    if(count>(size/2))
      {
	printf("\nThe majority of the element is: %d",a[indexofmaj]);
      }
    else
      {
	printf("\nThere are no Majority Elements in the given array.\n");
      }
 getch();
}
