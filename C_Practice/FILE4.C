//wap to read and write using fputc and fgetc function.
#include<stdio.h>
#include<conio.h>

void main()
{
 FILE *fp;
 char ch;
 clrscr();
 fp=fopen("C:/temp/myfile.txt","w");
 fputc('M',fp);
 fclose(fp);
 printf("\n Character entered.\n");
 fp=fopen("C:/temp/sample.txt","r");
 while((ch=fgetc(fp)) != EOF)
 {
  printf("%c",ch);
 }
 fclose(fp);
 getch();
}