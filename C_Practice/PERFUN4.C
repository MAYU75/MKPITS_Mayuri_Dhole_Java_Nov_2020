//C program to find the division of a student using function
//with no arguments and with return type
#include<stdio.h>
#include<conio.h>

float percentage();

void main()
{
 int per;
 clrscr();
 per=percentage();
 if(per>=80)
 {
  printf("\n %d is in First division",per);
 }
 else
 {
  if(per>=60)
  {
   printf("\n %d is in second division",per);
  }
  else
  {
   if(per>=40)
   {
    printf("\n %d is in Third division",per);
   }
   else
   {
    printf("\n %d is Fail",per);
   }
  }
 }
 getch();
}

float percentage()
{
 int m1,m2,m3,m4,m5,total,p;
 printf("\n Enter five subjects marks:");
 scanf("%d%d%d%d%d",&m1,&m2,&m3,&m4,&m5);
 total=m1+m2+m3+m4+m5;
 p=total/5;
 return p;
}