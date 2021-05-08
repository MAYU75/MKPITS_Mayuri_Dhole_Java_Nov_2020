#include<stdio.h>
#include<conio.h>
#include<math.h>

void main()
{
 int x1,x2,y1,y2,dist,p1,p2,p;
 clrscr();
 printf("\n Enter the co-ordinates of first point:");
 scanf("%d%d",&x1,&y1);
 printf("\n Enter the co-ordinates of second point:");
 scanf("%d%d",&x2,&y2);
 p1=pow((x2-x1),2);
 p2=pow((y2-y1),2);
 p=p1+p2;
 dist=sqrt(p);
 printf("\n The distance between two given points is %d",dist);
 getch();
}
