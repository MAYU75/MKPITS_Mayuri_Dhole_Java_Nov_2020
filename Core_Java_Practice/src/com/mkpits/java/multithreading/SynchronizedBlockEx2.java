//Java Program Example of synchronized block by using annonymous class.

package src.com.mkpits.java.multithreading;

class TableSynchronizedBlockEx2 {
    void printTable(int n) {
        synchronized (this) {//synchronized block
            for (int i = 1; i <= 5; i++) {
                System.out.println(n + " * " + i + " = " + n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }//end of synchronized block
    }//end of the method
}

public class SynchronizedBlockEx2 {
    public static void main(String[] args) {
        final TableSynchronizedBlockEx2 obj = new TableSynchronizedBlockEx2();//only one object

        Thread t1 = new Thread() {
            public void run() {
                obj.printTable(5);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                obj.printTable(100);
            }
        };

        t1.start();
        t2.start();
    }
}
