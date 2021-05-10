//Creating structure student having members rno, name, address.
//Pass this structure to function to display structure members values.
#include<stdio.h>
#include<conio.h>

void showdata(struct student);

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
 showdata(stud1);
 showdata(stud2);
 getch();
}

void showdata(struct student stud)
{
 printf("\n ---------------Student details --------------");
 printf("\n Student roll no: %d",stud.rno);
 printf("\n Student Name: %s",stud.name);
 printf("\n Student address: %s",stud.address);
}