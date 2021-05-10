//C program to calculate profit and loss on a transaction.

#include<stdio.h>
#include<conio.h>

void main()
{
 int cp,sp,loss,profit;
 clrscr();
 printf("\n Enter the Cost price: ");
 scanf("%d",&cp);
 printf("\n Enter the selling price: ");
 scanf("%d",&sp);
 if(sp>cp)
   {
    profit=sp-cp;
    printf("\n Profit on the transaction is %d",profit);
   }
 else
   {
    loss=cp-sp;
    printf("\n Loss on the transaction is %d",loss);
   }
 getch();
}
