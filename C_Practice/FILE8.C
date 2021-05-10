//wap to read the same file two time using rewind function.
#include<stdio.h>
#include<conio.h>

void main()
{
 FILE *fp;
 char c;
 clrscr();
 fp=fopen("C:/temp/sample.txt","r");
 while((c=fgetc(fp)) != EOF)
 {
  printf("%c",c);
 }
 rewind(fp);
 while((c=fgetc(fp)) != EOF)
 {
  printf("%c",c);
 }
 fclose(fp);
 getch();
}