// Java program to create class product

import java.util.*;

class product
{
String pid;
String pname;
int p_qty;
float SP;
String batch_name;
String mfg_dt;
String expiry_dt;

void addproduct()
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter product ID: ");
pid = scan.next();
System.out.println("Enter product name: ");
pname = scan.next();
System.out.println("Enter product quantity: ");
p_qty = scan.nextInt();
System.out.println("Enter product Selling Price: ");
SP = scan.nextFloat();
System.out.println("Enter product Batch Name: ");
batch_name = scan.next();
System.out.println("Enter product Manufacturing date: ");
mfg_dt = scan.next();
System.out.println("Enter product Expiry date: ");
expiry_dt = scan.next();
prg();
}
void updateproduct()
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter product ID: ");
pid = scan.next();
System.out.println("Enter product name: ");
pname = scan.next();
System.out.println("Enter product quantity: ");
p_qty = scan.nextInt();
System.out.println("Enter product Selling Price: ");
SP = scan.nextFloat();
System.out.println("Enter product Batch Name: ");
batch_name = scan.next();
System.out.println("Enter product Manufacturing date: ");
mfg_dt = scan.next();
System.out.println("Enter product Expiry date: ");
expiry_dt = scan.next();
prg();
}

void display()
{
System.out.println("product ID: " + pid);
System.out.println("product name: " + pname);
System.out.println("product quantity: " + p_qty);
System.out.println("product Selling Price: " + SP);
System.out.println("product Batch Name: " + batch_name);
System.out.println("product Manufacturing date: " + mfg_dt);
System.out.println("product Expiry date: " + expiry_dt);
prg();
}
void removeproduct()
{
pid = null;
pname = null;
p_qty = 0;
SP = 0.0f;
batch_name = null;
mfg_dt = null;
expiry_dt = null;
System.out.println("product ID: " + pid);
System.out.println("product name: " + pname);
System.out.println("product quantity: " + p_qty);
System.out.println("product Selling Price: " + SP);
System.out.println("product Batch Name: " + batch_name);
System.out.println("product Manufacturing date: " + mfg_dt);
System.out.println("product Expiry date: " + expiry_dt);
prg();
}
void prg()
{
int ch=0;
System.out.println("enter choice 1 for add , 2 for remove, 3 for display,4 for exit ");
Scanner scan = new Scanner(System.in);
ch = scan.nextInt();

char value;

switch(ch)
{
case 1:
addproduct();
break;
case 2:
removeproduct();
break;
case 3:
display();
break;
case 4:
System.exit(0);
break;
default:
System.out.println("invalid ");
break;
}
}

}
class productmainupdate
{
public static void main(String[] args)
{
product p = new product();
p.prg();
/*
System.out.println("Do yo want to remove the product (Y/N): ");
Scanner scan = new Scanner(System.in);
value = scan.next().charAt(0);
if(value == 'Y')
p.removeproduct();
else
System.out.println("The product details will not be removed.");
*/

}
}