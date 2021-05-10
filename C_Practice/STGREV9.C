//C program to print a string in reverse order.
//Input a string to reverse: Welcome
//Expected Output:
//Reversed string is: emocleW

#include<stdio.h>
#include<conio.h>
#include<string.h>

void main()
{
 char strg[25];
 clrscr();
 printf("\n Enter the string to reverse: ");
 scanf("%s",&strg);
 printf("\n The reversed string is: %s",strrev(strg));
 getch();
}

