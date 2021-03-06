//Java program to demonstrate problem without toString() method.
//The simple code that prints reference. Printing s1 and s2 prints the hashcode values of the objects

class Ex1ToDemonstrateProblemWithoutToStringMethod {
    int rollno;
    String name;
    String city;

    Ex1ToDemonstrateProblemWithoutToStringMethod(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    public static void main(String[] args) {
        Ex1ToDemonstrateProblemWithoutToStringMethod s1 = new Ex1ToDemonstrateProblemWithoutToStringMethod(101, "Mayuri", "Nagpur");
        Ex1ToDemonstrateProblemWithoutToStringMethod s2 = new Ex1ToDemonstrateProblemWithoutToStringMethod(102, "Sharvari", "Chandrapur");

        System.out.println(s1);//compiler writes here s1.toString()
        System.out.println(s2);//compiler writes here s2.toString()
    }
}
