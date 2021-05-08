#include<stdio.h>
#include<conio.h>

void add()
{
  int num1,num2,result;
  printf("\n Enter two numbers: ");
  scanf("%d%d",&num1,&num2);
  result=num1+num2;
  printf("\n Addition is %d",result);
}

void sub()
{
  int num1,num2,result;
  printf("\n Enter two numbers: ");
  scanf("%d%d",&num1,&num2);
  result=num1-num2;
  printf("\n Subtraction is %d",result);
}

void mul()
{
  int num1,num2,result;
  printf("\n Enter two numbers: ");
  scanf("%d%d",&num1,&num2);
  result=num1*num2;
  printf("\n Multiplication is %d",result);
}

void div()
{
  int num1,num2,result;
  printf("\n Enter two numbers: ");
  scanf("%d%d",&num1,&num2);
  result=num1/num2;
  printf("\n Division is %d",result);
}

void main()
{

 int i;
 clrscr();
 printf("\n Please enter one of the below options for performing specific task:");
 printf("\n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division");
 printf("\n Please enter your choice: ");
 scanf("%d",&i);
 switch(i)
 {
  case 1:add();
	 break;
  case 2:sub();
	 break;
  case 3:mul();
	 break;
  case 4:div();
	 break;
  default:printf("\n You have entered wrong choice.");
 }
 getch();
}

