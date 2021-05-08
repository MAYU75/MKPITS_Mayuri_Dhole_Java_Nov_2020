#include<stdio.h>
#include<conio.h>

void main()
{
 float item1weight,item2weight,item1purchase,item2purchase,average1,average2;
 clrscr();
 printf("\nEnter the weights of item1 and item2:");
 scanf("%f%f",&item1weight,&item2weight);
 printf("\nEnter the value of purchase for item1 and item2:");
 scanf("%f%f",&item1purchase,&item2purchase);
 average1=(item1weight*item1purchase)/item1purchase;
 average2=(item2weight*item2purchase)/item2purchase;
 Printf("\n The average weight of item1 :%f",average1);
 Printf("\n The average weight of item2 :%f",average2);
 getch();
}
