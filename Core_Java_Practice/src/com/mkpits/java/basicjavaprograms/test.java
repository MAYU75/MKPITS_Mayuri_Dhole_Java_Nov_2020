//2) Java program to create a class employee having fields empno and empname.

package src.com.mkpits.java.basicjavaprograms;

class EmployeeEx2 {
    int empno;
    String empname;
}

class test {
    public static void main(String[] args) {
        EmployeeEx2 e1 = new EmployeeEx2();
        EmployeeEx2 e2 = new EmployeeEx2();
        e1.empno = 01;
        e1.empname = "Mayuri";
        System.out.println("First Employee number: " + e1.empno);
        System.out.println("First Employee name: " + e1.empname);
        System.out.println("------------------------------------------");
        e2.empno = 02;
        e2.empname = "Madhuri";
        System.out.println("Second Employee number: " + e2.empno);
        System.out.println("Second Employee name: " + e2.empname);
    }
}
