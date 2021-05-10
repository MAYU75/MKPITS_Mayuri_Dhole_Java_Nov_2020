//wap to read and write using fputs and fgets function.
#include<stdio.h>
#include<conio.h>

void main()
{
 FILE *fp;
 char ch;
 char text[300];
 clrscr();
 fp=fopen("C:/temp/puts.txt","w");
 fputs("welcome to c",fp);
 fclose(fp);
 fp=fopen("C:/temp/sample.txt","r");
 printf("%s",fgets(text,200,fp));
 fclose(fp);
 getch();
}