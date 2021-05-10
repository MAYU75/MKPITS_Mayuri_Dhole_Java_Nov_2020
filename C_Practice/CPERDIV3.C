//C program to read roll no, name and marks of three subjects and calculate
//the total, percentage and division.

#include<stdio.h>
#include<conio.h>

void main()
{
 int rollno,m1,m2,m3,total,per;
 char name[15];
 clrscr();
 printf("\n Enter the roll no. of the student: ");
 scanf("%d",&rollno);
 printf("\n Enter the name of the student: ");
 scanf("%s",name);
 printf("\n Enter the three subject marks of the student: ");
 scanf("%d%d%d",&m1,&m2,&m3);
 total=m1+m2+m3;
 per=total/3;
 if(per>=80)
   printf("%s passed in first division with %d percentage.",name,per);
 else if(per<80 && per>=60)
	 printf("\n%s passed in second division with %d percentage.",name,per);
      else if(per<60 && per>=40)
	     printf("\n%s passed in third division with %d percentage.",name,per);
	   else
	     printf("\n%s has failed with %d percentage.",name,per);
 getch();
}