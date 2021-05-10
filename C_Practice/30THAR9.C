//C program to find sum of right diagonals of a matrix.

#include<stdio.h>
#include<conio.h>

void main()
{
  int a[10][10],i,j,size,sum=0;
  clrscr();
  printf("\n Enter the size of square matrix(less than 10): ");
  scanf("%d",&size);
  printf("\n Enter the elements of matrix:\n");
  for(i=0;i<size;i++)
  {
    for(j=0;j<size;j++)
    {
      scanf("%d",&a[i][j]);
      if(i==j)
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
  printf("\n Sum of right diagonals elements of matrix is %d",sum);
  getch();
}