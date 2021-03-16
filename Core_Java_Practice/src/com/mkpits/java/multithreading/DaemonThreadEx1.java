//Java program Example of Daemon thread.

public class DaemonThreadEx1 extends Thread {
	public void run() {
      	if(Thread.currentThread().isDaemon()) {//checking for daemon thread
       		System.out.println("daemon thread work");
      	}
      	else {
      		System.out.println("user thread work");
     	}
   }
   public static void main(String[] args) {
      DaemonThreadEx1 t1=new DaemonThreadEx1();//creating thread
      DaemonThreadEx1 t2=new DaemonThreadEx1();
      DaemonThreadEx1 t3=new DaemonThreadEx1();

      t1.setDaemon(true);//now t1 is daemon thread

      t1.start();//starting threads
      t2.start();
      t3.start();
   }
}
