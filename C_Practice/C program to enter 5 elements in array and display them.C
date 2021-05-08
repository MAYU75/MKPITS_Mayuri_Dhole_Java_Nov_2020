#include<stdio.h>
#include<conio.h>

void main()
{
 int i,num[5];
 clrscr();
 printf("\n Enter 5 elements: ");
 for(i=0;i<5;i++)
 {
  scanf("%d",&num[i]);
 }
 printf("\n The array elements are: ");
 for(i=0;i<5;i++)
 {
  printf("\nnum[%d]= %d ",i,num[i]);
 }
 getch();
}
