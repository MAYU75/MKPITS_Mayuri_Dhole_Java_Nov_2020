#include<stdio.h>
#include<conio.h>
void main()
{
 int radius,height;
 float volume,pi=3.142;
 clrscr();
 printf("\n Enter the value of radius and height of the cone:");
 scanf("%d%d",&radius,&height);
 volume=(pi*radius*radius*height)/3;
 printf("\n Volume of cone is %f",volume);
 getch();
}