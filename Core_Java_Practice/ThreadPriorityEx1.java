//Java program Example of priority of a Thread.

class ThreadPriorityEx1 extends Thread {
     public void run() {
        System.out.println("running thread name is:"+Thread.currentThread().getName());
        System.out.println("running thread priority is:"+Thread.currentThread().getPriority());
     }
     public static void main(String args[]) {
      	ThreadPriorityEx1 m1=new ThreadPriorityEx1();
      	ThreadPriorityEx1 m2=new ThreadPriorityEx1();
      	m1.setPriority(Thread.MIN_PRIORITY);
      	m2.setPriority(Thread.MAX_PRIORITY);
      	m1.start();
      	m2.start();
     }
}
