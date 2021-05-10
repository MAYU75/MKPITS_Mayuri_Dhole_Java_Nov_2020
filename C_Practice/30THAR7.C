//C program for multiplication of two matrices of two sqaure matices.

#include<stdio.h>
#include<conio.h>

void main()
{
  int a[10][10],b[10][10],c[10][10],i,j,k,size,sum=0;
  clrscr();
  printf("\n Enter the size of the square matrix(less than 10): ");
  scanf("%d",&size);
  printf("\n Enter the elements of first matrix:\n");
  for(i=0;i<size;i++)
  {
    for(j=0;j<size;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  printf("\n Enter the elements of second matrix:\n");
  for(i=0;i<size;i++)
  {
    for(j=0;j<size;j++)
    {
      scanf("%d",&b[i][j]);
    }
  }
  for(i=0;i<size;i++)
  {
    for(j=0;j<size;j++)
    {
      for(k=0;k<size;k++)
      {
	 sum=sum+a[i][k]*b[k][j];
      }
      c[i][j]=sum;
      sum=0;
    }
  }
  printf("\n The first matrix is:\n");
  for(i=0;i<size;i++)
  {
    for(j=0;j<size;j++)
    {
      printf("%d  ",a[i][j]);
    }
    printf("\n");
  }
  printf("\n The second matrix is:\n");
  for(i=0;i<size;i++)
  {
    for(j=0;j<size;j++)
    {
      printf("%d  ",b[i][j]);
    }
    printf("\n");
  }
  printf("\n The multiplication of two matrix is:\n");
  for(i=0;i<size;i++)
  {
    for(j=0;j<size;j++)
    {
      printf("%d  ",c[i][j]);
    }
    printf("\n");
  }
  getch();
}