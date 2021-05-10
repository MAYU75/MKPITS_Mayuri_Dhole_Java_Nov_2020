//wap to read contents from the file using fscanf function.
#include<stdio.h>
#include<conio.h>

void main()
{
 FILE *fp;
 char buff[255];
 clrscr();
 fp=fopen("C:/temp/sample.txt","r");
 while(fscanf(fp,"%s",buff) != EOF)
 {
  printf("%s",buff);
 }
 fclose(fp);
 getch();
}