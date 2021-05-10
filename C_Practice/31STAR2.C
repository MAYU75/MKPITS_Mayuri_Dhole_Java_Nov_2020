//C program to accept two matrices and check whether they are equal.

#include<stdio.h>
#include<conio.h>

void main()
{
  int i,j,r1,c1,r2,c2,a[10][10],b[10][10],flag=0;
  clrscr();
  printf("\n Enter the rows and columns of first matrix (upto 10): ");
  scanf("%d%d",&r1,&c1);
  printf("\n Enter the rows and columns of second matrix (upto 10): ");
  scanf("%d%d",&r2,&c2);
  printf("\n Enter the elements of first matrix:\n");
  for(i=0;i<r1;i++)
  {
    for(j=0;j<c1;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  printf("\n Enter the elements of second matrix:\n");
  for(i=0;i<r2;i++)
  {
    for(j=0;j<c2;j++)
    {
      scanf("%d",&b[i][j]);
    }
  }
  for(i=0;i<r1;i++)
  {
    for(j=0;j<c1;j++)
    {
      if(a[i][j] != b[i][j])
      {
	flag=1;
	break;
      }
    }
  }
  printf("\n The first matrix is:\n");
  for(i=0;i<r1;i++)
  {
    for(j=0;j<c1;j++)
    {
      printf("%d    ",a[i][j]);
    }
    printf("\n");
  }
  printf("\n The second matrix is:\n");
  for(i=0;i<r2;i++)
  {
    for(j=0;j<c2;j++)
    {
      printf("%d    ",b[i][j]);
    }
    printf("\n");
  }
  if(flag==0 && r1==r2 && c1==c2)
  {
    printf("\n The matrix can be compared. Two matrices are equal.");
  }
  else
  {
    printf("\n The two matrices are not equal.");
  }
  getch();
}
