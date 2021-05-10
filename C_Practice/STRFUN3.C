//C program to print the length of string using function with
//arguments and return type
#include<stdio.h>
#include<conio.h>
#include<string.h>

int stringfunc(char strg[]);

void main()
{
  char string[30];
  int j;
  clrscr();
  printf("\n Enter the string: ");
  scanf("%s",string);
  j=stringfunc(string);
  printf("\n The length of string is %d.",j);
  getch();
}

int stringfunc(char strg[])
{
 int i;
 i=strlen(strg);
 return i;
}