//C program to demonstrate switch using function with no arguments
//and no return type
#include<stdio.h>
#include<conio.h>

void switchfn();

void main()
{
 clrscr();
 switchfn();
 getch();
}

void switchfn()
{
 int num1,num2,result,a;
 printf("\n Enter the option from below");
 printf("\n 1.Addition \n2.Subtraction \n3.Multiplication \n4.Division\n");
 printf("\n Enter your choice: ");
 scanf("%d",&a);
 switch(a)
 {
  case 1: printf("\ Enter two numbers:");
	  scanf("%d%d",&num1,&num2);
	  result=num1+num2;
	  printf("\n The addition of two numbers is %d",result);
	  break;
  case 2: printf("\ Enter two numbers:");
	  scanf("%d%d",&num1,&num2);
	  result=num1-num2;
	  printf("\n The subtraction of two numbers is %d",result);
	  break;
  case 3: printf("\ Enter two numbers:");
	  scanf("%d%d",&num1,&num2);
	  result=num1*num2;
	  printf("\n The multiplication of two numbers is %d",result);
	  break;
  case 4: printf("\ Enter two numbers:");
	  scanf("%d%d",&num1,&num2);
	  result=num1/num2;
	  printf("\n The division of two numbers is %d",result);
	  break;
  default:printf("\n You have entered wrong choice.");
 }
}