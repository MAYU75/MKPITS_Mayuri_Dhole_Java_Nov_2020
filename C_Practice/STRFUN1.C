//C program to print the length of string using function with
//no arguments and no return type
#include<stdio.h>
#include<conio.h>
#include<string.h>

void stringfunc();

void main()
{
  clrscr();
  stringfunc();
  getch();
}

void stringfunc()
{
 char string[30];
 int i;
 printf("\n Enter the string: ");
 scanf("%s",string);
 i=strlen(string);
 printf("\n The length of string is %d.",i);
}