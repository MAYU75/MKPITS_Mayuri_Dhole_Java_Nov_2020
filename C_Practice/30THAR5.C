//C program for addition of two matrices of same size.

#include<stdio.h>
#include<conio.h>

void main()
{
  int a[10][10],b[10][10],c[10][10],i,j,size;
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
      c[i][j]=a[i][j]+b[i][j];
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
  printf("\n The addition of two matrix is:\n");
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