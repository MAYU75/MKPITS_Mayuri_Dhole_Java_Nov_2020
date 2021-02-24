//Java program Example of Daemon thread.
//If you want to make a user thread as Daemon,
//it must not be started otherwise it will throw IllegalThreadStateException.

class DaemonThreadEx2 extends Thread {
     public void run() {
      	System.out.println("Name: "+Thread.currentThread().getName());
      	System.out.println("Daemon: "+Thread.currentThread().isDaemon());
     }

     public static void main(String[] args) {
      	DaemonThreadEx2 t1=new DaemonThreadEx2();
      	DaemonThreadEx2 t2=new DaemonThreadEx2();
      	t1.start();
      	t1.setDaemon(true);//will throw exception here
      	t2.start();
     }
}
