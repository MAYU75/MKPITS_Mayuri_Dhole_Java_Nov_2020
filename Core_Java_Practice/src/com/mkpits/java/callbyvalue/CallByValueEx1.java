//Java program to demonstrate Call by Value. No change in data.

class CallByValueEx1 {
    int data = 50;

    void change(int data) {
        data = data + 100;//changes will be in the local variable only
    }

    public static void main(String args[]) {
        CallByValueEx1 op = new CallByValueEx1();

        System.out.println("before change " + op.data);
        op.change(500);
        System.out.println("after change " + op.data);

    }
}
