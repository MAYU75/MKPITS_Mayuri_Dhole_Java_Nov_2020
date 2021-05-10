//wap to create a file
#include<stdio.h>
#include<conio.h>

void main()
{
 FILE *fp;
 clrscr();
 fp=fopen("C:/temp/myfile.txt","w");
 printf("\n File created.");
 fclose(fp);
 getch();
}