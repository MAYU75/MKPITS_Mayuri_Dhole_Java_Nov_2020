//Java program to demonstrate Call by Value. Here data is changed.

class CallByValueEx2 {
    int data = 50;

    void change(CallByValueEx2 op) {
        op.data = op.data + 100;//changes will be in the instance variable
    }


    public static void main(String args[]) {
        CallByValueEx2 op = new CallByValueEx2();

        System.out.println("before change " + op.data);
        op.change(op);//passing object
        System.out.println("after change " + op.data);

    }
}
