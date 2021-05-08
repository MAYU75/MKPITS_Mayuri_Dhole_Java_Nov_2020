#include<stdio.h>
#include<stdio.h>

void main()
{
 float  x,y,z,perimeter;
 clrscr();
 printf("\nInput the value of first side: ");
 scanf("%f",&x);
 printf("\nInput the value of second side: ");
 scanf("%f",&y);
 printf("\nInput the value of third side: ");
 scanf("%f",&z);
 if(x<(y+z) && y<(x+z) && z<(y+x))
 {
  perimeter=x+y+z;
  printf("\nPerimeter  = %f",perimeter);
 }
 else
 {
  printf("\n Triangle cannot be created.");
 }
 getch();
}
