//wap to set pointer to 8 position and write some text using fseek function.
#include<stdio.h>
#include<conio.h>

void main()
{
 FILE *fp;
 clrscr();
 fp=fopen("C:/temp/fseek.txt","w+");
 fputs("welcome to c",fp);
 fseek(fp,8,SEEK_SET);
 fputs(" mayuri",fp);
 fclose(fp);
 getch();
}