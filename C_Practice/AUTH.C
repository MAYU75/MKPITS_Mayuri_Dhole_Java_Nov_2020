//Authentication screen
#include<stdio.h>
#include<conio.h>
#include<string.h>

void success();
void invalidLogin();

void main()
{
 char username[10],password[10],ch;
 int i;
 clrscr();
 printf("\n Enter the username: ");
 scanf("%s",username);
 printf("\n Enter the password: ");
 for(i=0;i<10;i++)
 {
  ch=getch();
  password[i]=ch;
  if(ch!='\r')
  {
   printf("*");
  }
  if(ch=='\r')
  {
   break;
  }
 }
 password[i]='\0';
 if(strcmp(username,password)==0)
 {
  success();
 }
 else
 {
  invalidLogin();
 }
 getch();
}

void success()
{
 printf("\n Login Successful.");
}

void invalidLogin()
{
 printf("\n Invalid Login.");
}
