//C program to find sum of left diagonals of a matrix.

#include<stdio.h>
#include<conio.h>

void main()
{
  int a[10][10],i,j,size,sum=0,column=0;
  clrscr();
  printf("\n Enter the size of square matrix(less than 10): ");
  scanf("%d",&size);
  column=size;
  printf("\n Enter the elements of matrix:\n");
  for(i=0;i<size;i++)
  {
    for(j=0;j<size;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  for(i=0;i<size;i++)
  {
    column=column-1;
    for(j=0;j<size;j++)
    {
      if(j == column)
      {
	 sum=sum+a[i][j];
      }
    }
  }
  printf("\n The matrix is:\n");
  for(i=0;i<size;i++)
  {
    for(j=0;j<size;j++)
    {
      printf("%d   ",a[i][j]);
    }
    printf("\n");
  }
  printf("\n Sum of left diagonals elements of matrix is %d",sum);
  getch();
}