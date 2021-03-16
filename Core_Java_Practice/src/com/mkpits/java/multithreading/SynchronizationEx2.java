//Java program example of synchronized method.
//When a thread invokes a synchronized method,
//it automatically acquires the lock for that object and
//releases it when the thread completes its task.

package src.com.mkpits.java.multithreading;

class TableSynchronizationEx2 {
    synchronized void printTable(int n) {//synchronized method
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

class MyThread1SynchronizationEx2 extends Thread {
    TableSynchronizationEx2 t;

    MyThread1SynchronizationEx2(TableSynchronizationEx2 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyThread2SynchronizationEx2 extends Thread {
    TableSynchronizationEx2 t;

    MyThread2SynchronizationEx2(TableSynchronizationEx2 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

public class SynchronizationEx2 {
    public static void main(String[] args) {
        TableSynchronizationEx2 obj = new TableSynchronizationEx2();//only one object
        MyThread1SynchronizationEx2 t1 = new MyThread1SynchronizationEx2(obj);
        MyThread2SynchronizationEx2 t2 = new MyThread2SynchronizationEx2(obj);
        t1.start();
        t2.start();
    }
}
