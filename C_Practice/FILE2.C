//wap to write some text to file using fprintf function
#include<stdio.h>
#include<conio.h>

void main()
{
 FILE *fp;
 char ch;
 clrscr();
 fp=fopen("C:/temp/sample.txt","w");
 fprintf(fp,"This is sample text.");
 fprintf(fp,"\n This is new sample text.");
 fclose(fp);
 printf("\n Data has been written to file 'sample'.");
 getch();
}