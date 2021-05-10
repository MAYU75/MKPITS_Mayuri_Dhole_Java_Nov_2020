//C program to accept a grade and declare the equivalent description

#include<stdio.h>
#include<conio.h>

void main()
{
 char grade;
 clrscr();
 printf("\n Enter the grade obtained in uppercase: ");
 scanf("%c",&grade);
 switch(grade)
 {
  case 'E': printf("\n Grade is excellent.");
	    break;
  case 'V': printf("\n Grade is very good.");
	    break;
  case 'G': printf("\n Grade is good.");
	    break;
  case 'A': printf("\n Grade is average.");
	    break;
  case 'F': printf("\n Grade is fail.");
	    break;
  default : printf("\n Wrong choice.");
 }
 getch();
}