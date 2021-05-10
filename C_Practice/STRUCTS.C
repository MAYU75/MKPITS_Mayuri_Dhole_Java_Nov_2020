//Creating structure student having members rno, name, address
#include<stdio.h>
#include<conio.h>

struct student
{
 char name[20],address[30];
 int rno;
}stud1,stud2;

void main()
{
 clrscr();
 printf("\n Enter the roll number of the student1: ");
 scanf("%d",&stud1.rno);
 printf("\n Enter the name of the student1: ");
 scanf("%s",&stud1.name);
 printf("\n Enter the address of the student1: ");
 scanf("%s",&stud1.address);
 printf("\n Enter the roll number of the student2: ");
 scanf("%d",&stud2.rno);
 printf("\n Enter the name of the student2: ");
 scanf("%s",&stud2.name);
 printf("\n Enter the address of the student2: ");
 scanf("%s",&stud2.address);
 printf("\n ---------------Student 1 details --------------");
 printf("\n Student roll no: %d",stud1.rno);
 printf("\n Student Name: %s",stud1.name);
 printf("\n Student address: %s",stud1.address);
 printf("\n ---------------Student 2 details --------------");
 printf("\n Student roll no: %d",stud2.rno);
 printf("\n Student Name: %s",stud2.name);
 printf("\n Student address: %s",stud2.address);
 getch();
}