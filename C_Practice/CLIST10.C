//C program that takes three numbers (x,y,z) as input and
//print the output of (x+y).z and x.y + y.z

#include<stdio.h>
#include<conio.h>

void main()
{
 int x,y,z,r1,r2;
 clrscr();
 printf("\n Enter three numbers: ");
 scanf("%d%d%d",&x,&y,&z);
 r1=(x+y)*z;
 r2=(x*y)+(y*z);
 printf("\n (x+y).z = %d",r1);
 printf("\n x.y + y.z = %d",r2);
 getch();
}
