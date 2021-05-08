#include<stdio.h>
#include<conio.h>

void main()
{
 float num1,num2,num3,num4;
 float max,min,diff;
 clrscr();
 printf("\nEnter four numbers: \n");
 scanf("%f%f%f%f",&num1,&num2,&num3,&num4);
 if(num1>=num2 && num1>=num3 && num1>=num4)
 {
  max=num1;
 }
 else if(num2>=num1 && num2>=num3 && num2>=num4)
      {
	max=num2;
      }
      else if (num3>=num1 && num3>=num2 && num3>=num4)
	   {
	    max=num3;
	   }
	   else
	   {
	    max=num4;
	   }
 if(num1<=num2 && num1<=num3 && num1<=num4)
 {
  min=num1;
 }
 else if(num2<=num1 && num2<=num3 && num2<=num4)
      {
       min=num2;
      }
      else if(num3<=num1 && num3<=num2 && num3<=num4)
      {
       min=num3;
      }
	   else
	   {
	    min=num4;
	   }
 diff=max-min;
 printf("\nDifference is %f",diff);
 getch();
}
