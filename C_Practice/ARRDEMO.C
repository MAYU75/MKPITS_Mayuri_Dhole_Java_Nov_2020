//Program to print array using
//function with arguments and no return type
#include<stdio.h>
#include<conio.h>

void arraysl(int a[]);

void main()
{
 int num[5]={2,8,7,5,0};
 clrscr();
 /*printf("\n How many elements you want to enter: ");
 scanf("%d",&num);*/
 arraysl(num);
 getch();
}

void arraysl(int a[])
{
 int i;
 for(i=0;i<=4;i++)
 {
  printf("\n %d",a[i]);
 }
}