//1) Java program to create a class student having fields rno and name

package src.com.mkpits.java.basicjavaprograms;

class StudentEx1 {
    int rno;
    String name;
}

class studentmain {
    public static void main(String[] args) {
        StudentEx1 s1 = new StudentEx1();
        s1.rno = 45;
        s1.name = "Mayuri";
        System.out.println("Roll number of first student: " + s1.rno);
        System.out.println("Name of first student: " + s1.name);
        System.out.println("-----------------------------------------------");
        StudentEx1 s2 = new StudentEx1();
        s2.rno = 36;
        s2.name = "Sonal";
        System.out.println("Roll number of second student: " + s2.rno);
        System.out.println("Name of second student: " + s2.name);
    }
}