//Java program to demonstrate toString() method.

class Ex2ToDemonstrateToStringMethod {
    int rollno;
    String name;
    String city;

    Ex2ToDemonstrateToStringMethod(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    public String toString() {//overriding the toString() method
        return rollno + " " + name + " " + city;
    }

    public static void main(String[] args) {
        Ex2ToDemonstrateToStringMethod s1 = new Ex2ToDemonstrateToStringMethod(101, "Mayuri", "Nagpur");
        Ex2ToDemonstrateToStringMethod s2 = new Ex2ToDemonstrateToStringMethod(102, "Sharvari", "Chandrapur");

        System.out.println(s1);//compiler writes here s1.toString()
        System.out.println(s2);//compiler writes here s2.toString()
    }
}
