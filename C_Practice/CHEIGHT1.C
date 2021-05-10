//C program to accept height of a person in centimeter and categorize the
//person according to their height.

#include<stdio.h>
#include<conio.h>

void main()
{
 float height;
 clrscr();
 printf("\n Enter the height of the person in centimeter: ");
 scanf("%f",&height);
 if(height<=145)
   printf("\n The person is having a short height.");
 else if(height>145 && height<=170)
	printf("\n The person is having average height.");
      else if(height>170 && height<=195)
	     printf("\n The person is tall in height.");
	   else
	     printf("\n The person is having an abnormal height.");
 getch();
}
