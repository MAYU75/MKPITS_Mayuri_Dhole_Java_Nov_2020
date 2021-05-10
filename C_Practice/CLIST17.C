//C program to accept two integers and check whether they are equal or not.
#include<stdio.h>
#include<conio.h>

void main()
{
 int n1,n2;
 clrscr();
 printf("\n Enter two integers: ");
 scanf("%d%d",&n1,&n2);
 if(n1 == n2)
 {
  printf("\n The two integers are equal.");
 }
 else
 {
  printf("\n The two integers are not equal.");
 }
 getch();
}