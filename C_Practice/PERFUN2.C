//C program to find the division of a student using function
//with arguments and no return type
#include<stdio.h>
#include<conio.h>

void percentage(int,int,int,int,int);

void main()
{
 int m1,m2,m3,m4,m5;
 clrscr();
 printf("\n Enter five subjects marks:");
 scanf("%d%d%d%d%d",&m1,&m2,&m3,&m4,&m5);
 percentage(m1,m2,m3,m4,m5);
 getch();
}

void percentage(int mrk1,int mrk2,int mrk3,int mrk4,int mrk5)
{
 int total,per;
 total=mrk1+mrk2+mrk3+mrk4+mrk5;
 per=total/5;
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
}