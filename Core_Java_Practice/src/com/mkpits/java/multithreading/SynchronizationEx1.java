//Java program to demonstrate the need for synchronization.
//In this example, there is no synchronization, so output is inconsistent.

package src.com.mkpits.java.multithreading;

class TableSynchronizationEx1 {
    void printTable(int n) {//method not synchronized
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread1SynchronizationEx1 extends Thread {
    TableSynchronizationEx1 t;

    MyThread1SynchronizationEx1(TableSynchronizationEx1 t) {

        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyThread2SynchronizationEx1 extends Thread {
    TableSynchronizationEx1 t;

    MyThread2SynchronizationEx1(TableSynchronizationEx1 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

class SynchronizationEx1 {
    public static void main(String[] args) {
        TableSynchronizationEx1 obj = new TableSynchronizationEx1();//only one object
        MyThread1SynchronizationEx1 t1 = new MyThread1SynchronizationEx1(obj);
        MyThread2SynchronizationEx1 t2 = new MyThread2SynchronizationEx1(obj);
        t1.start();
        t2.start();
    }
}
