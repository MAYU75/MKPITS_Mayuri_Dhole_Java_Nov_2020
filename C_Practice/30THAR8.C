//C program to find transpose of a given matrix.

#include<stdio.h>
#include<conio.h>

void main()
{
  int a[10][10],i,j,rows,columns;
  clrscr();
  printf("\n Enter the rows and columns of the matrix(less than 10): ");
  scanf("%d%d",&rows,&columns);
  printf("\n Enter the elements of matrix:\n");
  for(i=0;i<rows;i++)
  {
    for(j=0;j<columns;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  printf("\n The matrix is:\n");
  for(i=0;i<rows;i++)
  {
    for(j=0;j<columns;j++)
    {
      printf("%d    ",a[i][j]);
    }
    printf("\n");
  }
  printf("\n The transpose of a matrix is:\n");
  for(i=0;i<columns;i++)
  {
    for(j=0;j<rows;j++)
    {
      printf("%d    ",a[j][i]);
    }
    printf("\n");
  }
  getch();
}