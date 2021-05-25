//Java program to demonstrate how to store User-defined class objects in Java ArrayList.

package src.com.mkpits.java.arraylist;

import java.util.*;

class Student {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

public class ArrayListExToStoreUserdefinedClassObjectsInArrayList {
    public static void main(String[] args) {
        //Creating user-defined class objects
        Student s1 = new Student(101, "Aboli", 22);
        Student s2 = new Student(102, "Mayuri", 25);
        Student s3 = new Student(103, "Sharvari", 21);
        //creating arraylist
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(s1);//adding Student class object
        al.add(s2);
        al.add(s3);
        //Getting Iterator
        Iterator itr = al.iterator();
        //traversing elements of ArrayList object
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }

}
