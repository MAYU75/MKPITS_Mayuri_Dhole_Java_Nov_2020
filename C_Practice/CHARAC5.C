//C program to check whether a character is an alphabet, digit or special
//character

#include<stdio.h>
#include<conio.h>

void main()
{
 char ch;
 clrscr();
 printf("\n Enter the character: ");
 scanf("%c",&ch);
 if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
   printf("\n The character is an alphabet.");
 else if(ch>='0' && ch<='9')
	printf("\n The character is a digit.");
      else
	printf("\n The character is a special character.");
 getch();
}
