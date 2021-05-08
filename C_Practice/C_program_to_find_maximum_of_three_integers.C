#include<stdio.h>
#include<conio.h>
void main()
{
 int a,b,c;
 clrscr();
 printf("\nEnter three integers:");
 scanf("%d%d%d",&a,&b,&c);
 if(a>b && a>c)
 {
  printf("%d is the maximum",a);
 }
 else
 {
  if(b>a && b>c)
  {
   printf("\n%d is the maximum",b);
  }
  else
  {
   printf("\n%d is the maximum",c);
  }
 }
 getch();
}