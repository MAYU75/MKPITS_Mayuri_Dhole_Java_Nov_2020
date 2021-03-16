//Java program to demonstrate thread pool using ExecutorService and Executors.

package src.com.mkpits.java.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThreadThreadPoolEx implements Runnable {
    private String message;

    public WorkerThreadThreadPoolEx(String s) {
        this.message = s;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
        processmessage();//call processmessage method that sleeps the thread for 2 seconds
        System.out.println(Thread.currentThread().getName() + " (End)");//prints thread name
    }

    private void processmessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

public class ThreadPoolExUsingExecutorServiceAndExecutors {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThreadThreadPoolEx("" + i);
            executor.execute(worker);//calling execute method of ExecutorService
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }

        System.out.println("Finished all threads");
    }

}
