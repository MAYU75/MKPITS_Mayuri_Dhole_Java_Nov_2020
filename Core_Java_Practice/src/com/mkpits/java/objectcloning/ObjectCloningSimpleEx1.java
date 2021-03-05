//Java program to demonstrate clone() method (Object cloning) by cloning student data.
//simple example of object cloning

class ObjectCloningSimpleEx1 implements Cloneable {
    int rollno;
    String name;

    ObjectCloningSimpleEx1(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            ObjectCloningSimpleEx1 s1 = new ObjectCloningSimpleEx1(105, "Mayuri");

            ObjectCloningSimpleEx1 s2 = (ObjectCloningSimpleEx1) s1.clone();

            System.out.println("Roll no and Name of student1: " + s1.rollno + " " + s1.name);
            System.out.println("Roll no and Name of student2: " + s2.rollno + " " + s2.name);

        } catch (CloneNotSupportedException c) {
        }

    }
}
