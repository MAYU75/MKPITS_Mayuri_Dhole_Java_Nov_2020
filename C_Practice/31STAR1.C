//C program to find sum of rows and columns of a matrix.

#include<stdio.h>
#include<conio.h>

void main()
{
  int i,j,size,a[10][10],sum=0;
  clrscr();
  printf("\n Enter the size of the square matrix (upto 10): ");
  scanf("%d",&size);
  printf("\n Enter the elements of array:\n");
  for(i=0;i<size;i++)
  {
    for(j=0;j<size;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  for(i=0;i<size;i++)
  {
    for(j=0;j<size;j++)
    {
      sum=sum+a[i][j];
    }
    a[i][size]=sum;
    sum=0;
  }
  for(i=0;i<size;i++)
  {
    for(j=0;j<size;j++)
    {
      sum=sum+a[j][i];
    }
    a[size][i]=sum;
    sum=0;
  }
  printf("\n The matrix is:\n");
  for(i=0;i<size;i++)
  {
    for(j=0;j<size;j++)
    {
      printf("%d    ",a[i][j]);
    }
    printf("\n");
  }
  printf("\n The sum of rows and columns of the matrix is:\n");
  for(i=0;i<=size;i++)
  {
    for(j=0;j<=size;j++)
    {
      if(i==j && i==size)
	{
	  break;
	}
      printf("%d    ",a[i][j]);
    }
    printf("\n");
  }
  getch();
}
