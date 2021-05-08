/*C program to the print your name,date of birth and mobile number*/
#include<stdio.h>
#include<conio.h>

void main()
{
 char name[50],dob[10],mobile_no[20];
 clrscr();
 printf("\nEnter name,date of birth and mobile number:");
 scanf("%s%s%s",&name,&dob,&mobile_no);
 printf("Name  :%s",name);
 printf("\nDOB   :%s",dob);
 printf("\nMobile :%s",mobile_no);
 getch();
}