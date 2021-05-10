//wap showing ftell function
#include<stdio.h>
#include<conio.h>

void main()
{
 FILE *fp;
 int length;
 clrscr();
 fp=fopen("C:/temp/sample.txt","r");
 fseek(fp,0,SEEK_END);
 length=ftell(fp);
 fclose(fp);
 printf("\n Size of file: %d bytes",length);
 getch();
}