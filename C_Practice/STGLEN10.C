//C program to find the length of a string without using the library
//function.
//Input a string: welcome
//Expected output:
//The string contains 7 number of characters.
//So, the length of the string welcome is: 7

#include<stdio.h>
#include<conio.h>

void main()
{
 char strg[25];
 int i,count=0;
 clrscr();
 printf("\n Enter the string: ");
 scanf("%s",strg);
 for(i=0;i<25;i++)
 {
  if(strg[i] == '\0')
  {
   break;
  }
  count++;
 }
 printf("\n The string contains %d number of characters.",count);
 printf("\n So, the length of the string %s is: %d",strg,count);
 getch();
}
