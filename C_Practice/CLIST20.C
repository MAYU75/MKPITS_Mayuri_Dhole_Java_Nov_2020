//C program to read the age of a candidate and determine whether it is
//eligible for casting his/her own vote.
#include<stdio.h>
#include<conio.h>

void main()
{
 int age;
 clrscr();
 printf("\n Enter the age of the candidate: ");
 scanf("%d",&age);
 if(age>=18)
 {
  printf("\n The candidate is eligible for casting his/her vote.");
 }
 else
 {
  printf("\n The candidate is not eligible for casting his/her vote.");
 }
 getch();
}