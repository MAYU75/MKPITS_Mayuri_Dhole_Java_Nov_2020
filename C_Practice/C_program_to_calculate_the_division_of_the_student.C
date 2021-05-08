#include<stdio.h>
#include<conio.h>

void main()
{
 int m1,m2,m3,m4,m5,total,per;
 clrscr();
 printf("\n Enter five subjects marks:");
 scanf("%d%d%d%d%d",&m1,&m2,&m3,&m4,&m5);
 total=m1+m2+m3+m4+m5;
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
 getch();
}