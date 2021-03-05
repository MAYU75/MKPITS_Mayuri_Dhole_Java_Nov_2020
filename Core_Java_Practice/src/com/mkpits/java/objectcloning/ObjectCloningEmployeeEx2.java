//Java program to demonstrate clone() method (Object cloning) by cloning employee data.

class ObjectCloningEmployeeEx2 implements Cloneable {
    int empno;
    String empname;

    ObjectCloningEmployeeEx2(int empno, String empname) {
        this.empno = empno;
        this.empname = empname;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] arg) {
        try {
            ObjectCloningEmployeeEx2 e1 = new ObjectCloningEmployeeEx2(125, "Mayuri Dhole");
            ObjectCloningEmployeeEx2 e2 = (ObjectCloningEmployeeEx2) e1.clone();
            System.out.println(e1.empno + " : " + e1.empname);
            System.out.println(e2.empno + " : " + e2.empname);

        } catch (CloneNotSupportedException ex) {
            System.out.println(ex.toString());
        }

    }

}
