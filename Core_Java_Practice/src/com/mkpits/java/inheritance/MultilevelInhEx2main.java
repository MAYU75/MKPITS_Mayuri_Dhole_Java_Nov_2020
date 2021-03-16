//Example of Multilevel inheritance. Java program to create a class Person having instance variable name
//and create a derived class Employee having instance variable salary
//inherited from Person class, then create a derieved class
//parttimeemployee having instance variable workinghours derived from Employee class.

import java.util.*;
class PersonMultilevelInhEx2
{
	String name;
	void getpersondata(String name)
	{
		this.name=name;
	}
    void showpersondata()
    {
		System.out.println("Name = " + name);
	}
}
//////////////////////////////
class EmployeeMultilevelInhEx2 extends PersonMultilevelInhEx2
{
	float salary;
    void getemployeedata(float salary)
	{
		this.salary=salary;
	}
    void showemployeedata()
    {
		System.out.println("Salary = " + salary);
	}
}
//////////////////////////////////
class ParttimeEmployeeMultilevelInhEx2 extends EmployeeMultilevelInhEx2
{
	int workinghours;
	void getparttimeemployeedata(int workinghours)
	{
		this.workinghours=workinghours;
	}
    void showparttimeemployeedata()
    {
		System.out.println("Working hours = " + workinghours);
	}
}

class MultilevelInhEx2main
{
    public static void main(String args[])
    {
		Scanner scan=new Scanner(System.in);
    	ParttimeEmployeeMultilevelInhEx2  emp=new ParttimeEmployeeMultilevelInhEx2();
    	System.out.println("Enter employee name");
    	String ename=scan.next();
    	System.out.println("Enter salary");
    	float sal=scan.nextFloat();
    	System.out.println("Enter employee working hours");
    	int whours=scan.nextInt();
    	emp.getpersondata(ename);
    	emp.getemployeedata(sal);
    	emp.getparttimeemployeedata(whours);
    	emp.showpersondata();
    	emp.showemployeedata();
    	emp.showparttimeemployeedata();
   }
}
