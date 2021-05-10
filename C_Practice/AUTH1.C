//Authentication screen
#include<stdio.h>
#include<conio.h>
#include<string.h>

void success();
void invalidLogin();

void main()
{
 char a,username[10],password[10],ch,u1[10]={"ram"},ps[10]={"ram"};
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
 if(strcmp(username,u1)==0 && strcmp(password,ps)==0)
 {
  success();
 }
 else
 {
  invalidLogin();
 }
 printf("\n Do you want to try again to login ? (Y/N): ");
 fflush(stdin);
 scanf("%c",&a);
 clrscr();
 switch(a)
 {
  case 'Y': printf("\n Enter the username: ");
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
	    if(strcmp(username,u1)==0 && strcmp(password,ps)==0)
	    {
	     success();
	    }
	    break;
  case 'N': printf("\n Thank you for your login.");
	    break;
  default: printf("\n You have entered wrong choice");
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
