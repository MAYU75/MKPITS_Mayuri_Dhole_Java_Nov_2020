//C program to print the length of string using function with
//arguments and no return type
#include<stdio.h>
#include<conio.h>
#include<string.h>

void stringfunc(char strg[]);

void main()
{
  char string[30];
  clrscr();
  printf("\n Enter the string: ");
  scanf("%s",string);
  stringfunc(string);
  getch();
}

void stringfunc(char strg[])
{
 int i;
 i=strlen(strg);
 printf("\n The length of string is %d.",i);
}