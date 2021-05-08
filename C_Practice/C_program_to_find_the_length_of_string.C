#include<stdio.h>
#include<conio.h>
#include<string.h>

void main()
{
  char string[10];
  int i;
  clrscr();
  printf("\n Enter the string: ");
  scanf("%s",string);
  i=strlen(string);
  printf("\n The length of string is %d.",i);
  getch();
}
