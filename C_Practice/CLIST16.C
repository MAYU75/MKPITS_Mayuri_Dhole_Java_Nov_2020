//C program to reverse the words of a sentence.
#include<stdio.h>
#include<conio.h>
#include<string.h>

void main()
{
 char str[25],*revstrg;
 clrscr();
 printf("\n Enter the sentence whose words you want to reverse: ");
 gets(str);
 revstrg=strrev(str);
 printf("\n The reverse of the sentence is %s",revstrg);
 getch();
}