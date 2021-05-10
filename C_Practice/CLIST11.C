//C program that takes an age(for example 20) as input and
//prints something as "You look older than 20"

#include<stdio.h>
#include<conio.h>

void main()
{
 int age;
 clrscr();
 printf("\n Enter the age: ");
 scanf("%d",&age);
 if(age<=20)
 {
  printf("\n You look older than 20.");
 }
 getch();
}