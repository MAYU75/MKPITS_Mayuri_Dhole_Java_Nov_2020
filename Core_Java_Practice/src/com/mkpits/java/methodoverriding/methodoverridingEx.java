//Java program example of method overriding and overloading

import java.util.*;

class PersonMethodoverridingEx {
    String name;

    void getdata(String name) {
        this.name = name;
    }

    void showdata() {
        System.out.println("name = " + name);
    }
}

//////////////////////////////
class EmployeeMethodoverridingEx extends PersonMethodoverridingEx {
    float salary;

    //method overloading
    void getdata(String name, float salary) {
        getdata(name);
        this.salary = salary;
    }

    //method overriding
    void showdata() {
        super.showdata();//call super class(person ) showdata method
        System.out.println("salary = " + salary);
    }
}

//////////////////////////////////
class ParttimeEmployeeMethodoverridingEx extends EmployeeMethodoverridingEx {
    int workinghours;

    //overloading
    void getdata(String name, float salary, int workinghours) {
        getdata(name, salary);
        this.workinghours = workinghours;
    }

    //method overriding
    void showdata() {
        super.showdata();
        System.out.println("working hours = " + workinghours);
    }
}

class methodoverridingEx {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ParttimeEmployeeMethodoverridingEx emp = new ParttimeEmployeeMethodoverridingEx();
        System.out.println("enter employee name");
        String ename = sc.next();
        System.out.println("enter salary");
        float sal = sc.nextFloat();
        System.out.println("enter employee working hours");
        int whours = sc.nextInt();
        emp.getdata(ename, sal, whours);
        emp.showdata();
    }
}
