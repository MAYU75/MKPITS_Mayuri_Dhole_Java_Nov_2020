//C program for 2D array of size 3x3 and print the matrix.

#include<stdio.h>
#include<conio.h>

void main()
{
  int a[3][3],i,j;
  clrscr();
  printf("\n Enter the elements of a 3x3 matrix:\n");
  for(i=0;i<3;i++)
  {
    for(j=0;j<3;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  printf("\n The 3x3 matrix is:\n");
  for(i=0;i<3;i++)
  {
    for(j=0;j<3;j++)
    {
      printf("%d  ",a[i][j]);
    }
    printf("\n");
  }
  getch();
}