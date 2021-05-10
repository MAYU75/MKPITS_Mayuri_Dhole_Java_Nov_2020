//C program to check whether an alphabet is a vowel or consonant

#include<stdio.h>
#include<conio.h>

void main()
{
 char ch;
 clrscr();
 printf("\n Enter the alphabet: ");
 scanf("%c",&ch);
 if(ch=='a' || ch=='A')
   printf("\n The alphabet is a vowel.");
 else if(ch=='e' || ch=='E')
	printf("\n The alphabet is a vowel.");
      else if(ch=='i' || ch=='I')
	      printf("\n The alphabet is a vowel.");
	   else if(ch=='o' || ch=='O')
		   printf("\n The alphabet is a vowel.");
		else if(ch=='u' || ch=='U')
		       printf("\n The alphabet is a vowel.");
		     else
		       printf("\n The alphabet is a consonant.");
 getch();
}

