//4) Java program to create a class employee having fields empno and empname and accept
//the values from the user

package src.com.mkpits.java.basicjavaprograms;
import java.util.*;

class EmployeeEx4 {
    int empno;
    String empname;
}

class stud4main {
    public static void main(String[] args) {
        EmployeeEx4 e = new EmployeeEx4();
        //Accepting values from user.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee number: ");
        e.empno = scan.nextInt();
        System.out.println("Enter employee name: ");
        e.empname = scan.next();
        //Displaying the accepted values.
        System.out.println("--------------------------------------");
        System.out.println("Displaying the entered data: ");
        System.out.println("Employee number: " + e.empno);
        System.out.println("Employee Name: " + e.empname);
    }
}