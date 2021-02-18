//Java program to sleep a thread.

class ThreadSleepEx4 extends Thread {
     public void run() {
     	for(int i=1;i<15;i++) {
        	try {
				Thread.sleep(500);
        	}catch(InterruptedException e) {
				System.out.println(e);
			}
        	System.out.println("Thread is running " + i);
      	}
     }
     public static void main(String args[]) {
     	ThreadSleepEx4 t1=new ThreadSleepEx4();
      	ThreadSleepEx4 t2=new ThreadSleepEx4();
       	t1.start();
      	t2.start();
     }
}
