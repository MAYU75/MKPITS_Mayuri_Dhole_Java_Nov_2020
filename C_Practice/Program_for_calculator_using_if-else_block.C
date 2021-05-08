#include<stdio.h>
#include<conio.h>

void main()
{
 int num1,num2,result,a;
 clrscr();
 printf("\ Enter two numbers:");
 scanf("%d%d",&num1,&num2);
 printf("\n Enter the option from below");
 printf("\n 1.Addition \n2.Subtraction \n3.Multiplication \n4.Division\n");
 scanf("%d",&a);
 if(a==1)
 {
  result=num1+num2;
  printf("\n The addition of two numbers is %d",result);
 }
 else
 {
  if(a==2)
  {
   result=num1-num2;
   printf("\n The subtraction of two numbers is %d",result);
  }
  else
  {
   if(a==3)
   {
    result=num1*num2;
    printf("\n The multiplication of two numbers is %d",result);
   }
   else
   {
    if(a==4)
    {
     result=num1/num2;
     printf("\n The division of two numbers is %d",result);
    }
    else
    {
     printf("\n Wrong choice.");
    }
   }
  }
 }
 getch();
}